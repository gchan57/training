package linkedlist;
class Cnode{
    Cnode prev;
    Cnode next;
    int data;
}

class Method3{
static Cnode head,tail;
public static void insbegin(int a){
    Cnode newnode = new Cnode();
    newnode.next=null;
    newnode.prev=null;
    newnode.data=a;
    if(head==null){
        head=newnode;
        tail=newnode;
        newnode.next=newnode;
        newnode.prev=newnode;
    }
    else{
        head.prev=newnode;
        newnode.next=head;
        tail.next=newnode;//as tail next should always point newnode
        newnode.prev=tail;//as new node prev should always point  tail
        head=newnode;
    }
}
public static void inslast(int a){
    Cnode newnode = new Cnode();
    newnode.next=null;
    newnode.prev=null;
    newnode.data=a;
    if(head==null){
        head=newnode;
        tail=newnode;
        newnode.next=newnode;
        newnode.prev=newnode;
    }
    else{
        tail.next=newnode;
        newnode.prev=tail;
        newnode.next=head;
        head.prev=newnode;
        tail=newnode;
    }
}
public static void  insposc(int pos,int a){
    Cnode newnode = new Cnode();
    Cnode temp=head;
    newnode.next=null;
    newnode.prev=null;
    newnode.data=a;
    if(pos==0){
        insbegin(a);
    }
    for(int i=0;i<pos;i++){
        temp=temp.next;
    }
    newnode.prev=temp.prev;
    temp.prev.next=newnode;
    temp.prev=newnode;
    newnode.next=temp;

}
public static void deldcir(int pos){
    Cnode temp=head;
    if(pos==0){
        head=head.next;
    }
    for(int i=0;i<pos;i++){
        temp=temp.next;
    }
    temp.prev.next=temp.next;
    temp.next.prev=temp.prev;
}
public static void dcdisp(Cnode head){
    Cnode temp=head;
    do {
        System.out.print(temp.data+" ");
        temp=temp.next;
    }while(temp!=head);
}
}

class Doublycir extends Method3{
    public static void main(String[] args){
        //insbegin(1);
       // insbegin(2);
      // dcdisp(head); //head travels  with new data inserted
        inslast(1);
        inslast(3);
        dcdisp(head);
        System.out.println();
        insposc(1,2);
        dcdisp(head);
        System.out.println();
        deldcir(2);
        //deldcir(0);
        dcdisp(head);
        System.out.println();
    }

}