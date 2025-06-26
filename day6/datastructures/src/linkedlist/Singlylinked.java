// in project use the commanad    1>javac linkedlist/*.java,java linkedlist.Singlylinked
package linkedlist;

class Node{
    int data;
    Node link;
}
class Method{
    static Node head;
    static Node tail;
    public static void insertAtBegain(int data){
        Node newNode=new Node();
        newNode.data=data;
        newNode.link=null;
        if(head==null){// initially head is null so at start so head point first node
            head=newNode;
            tail=newNode;
        }
        else{
           newNode.link=head;
            head=newNode;
        }
    }
        public static void insertAtEnd(int data){
        Node newNode=new Node();
        newNode.data=data;
        newNode.link=null;
        if(head==null){// initially head is null so at start so head point first node
            head=newNode;
            tail=newNode;
        }
        else{
           
           tail.link=newNode;
           tail=newNode;
        }
    }
    public static void insertatpos(int pos,int data){
        Node temp=head;
        Node newNode=new Node();
        newNode.data=data;
        newNode.link=null;
        if(pos==0){
            insertAtBegain(data);
        }
        for(int i=1;i<pos;i++){
            temp=temp.link;      
        }
        newNode.link=temp.link;
        temp.link=newNode;

    }
    public static void delatpos(int pos){
        Node temp=head;
        if(pos==0){
            head=head.link;
        }
        for(int i=0;i<pos-1;i++){
            temp=temp.link;      
        }
        temp.link=temp.link.link;

    }
    public static void printlist(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.link;
        }
    }
}

public class Singlylinked extends Method {
    public static void main(String[] args){
       // insertAtBegain(1);
       //insertAtBegain(2);
       // printlist(head); //head moves with new data so it will print in reverse
        insertAtEnd(1);
        insertAtEnd(3);
        printlist(head);
        System.out.println();
        insertatpos(1,2);// considering index from 0
        printlist(head);
         System.out.println();
        delatpos(2);
        printlist(head);
         System.out.println();
        }
}