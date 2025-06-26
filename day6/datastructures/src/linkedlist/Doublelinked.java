package linkedlist;
class Dnode{
    int data ;
    Dnode prev;
    Dnode next;
}

class Method1{
    static Dnode head,tail;
        public static void  dinsbegin(int data){
        Dnode newNode=new Dnode();
        newNode.prev=null;
        newNode.next=null;
        newNode.data=data;
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    public static void disatpos(int pos,int data){
        Dnode newNode=new Dnode();
        newNode.prev=null;
        newNode.next=null;
        newNode.data=data;
        Dnode temp=head;
        if(pos==0){
             dinsbegin(data);
        }
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next.prev=newNode;
        temp.next=newNode;
        newNode.prev=temp;
    }
    public static void  dinslast(int data){
        Dnode newNode=new Dnode();
        newNode.prev=null;
        newNode.next=null;
        newNode.data=data;
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    public static void dldel(int pos){
    Dnode temp=head; 
   
        for(int i=0;i<pos;i++){
        temp=temp.next;
    }
    if(temp.next==null&&temp.prev==null){
        head=null;
        return;
    }
     if(temp.next==null){ // for end del
        temp.prev.next=null;
        return;
    }
    if(temp.prev==null){
        head=temp.next;
        return;
    }
   
    temp.prev.next=temp.next;
    temp.next.prev=temp.prev;
    }
    public static void disp(Dnode head){
        Dnode temp=head;
        if(head==null){
            System.out.println("No element");
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }


}

class Doublelinked extends Method1{
        public static void main(String[] args){
           // dinsbegin(1); //head propogates along with new data 
           // dinsbegin(2);
            //dinsbegin(3);
           // System.out.println();
            disp(head);
            dinslast(1);
            dinslast(3);
            disp(head);
            System.out.println();
            disatpos(1,2);
            disp(head);
            System.out.println();
            dldel(2);
            disp(head);
            System.out.println();
            dldel(1);
            disp(head);
            System.out.println();
            dldel(0);
            disp(head);
            System.out.println();
        }
}