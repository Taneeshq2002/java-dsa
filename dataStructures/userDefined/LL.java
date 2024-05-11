package dataStructures.userDefined;

public class LL {

    Node head;
    public int size;

    LL(){
        size=0;
    }
 class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
   
    }

    //add first/last
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
       
            newNode.next=head;
            head=newNode;
        
    }

    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        head=head.next;
        size--;
        
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        //if only one node is present
        if(head.next==null){
            head=null;
        }
        Node temp=head.next;
        Node tempPrev=head;
        
        while(temp.next!=null){
            temp=temp.next;
            tempPrev=tempPrev.next;
        }
        tempPrev.next=null;
        size--;
    }

    public void PrintList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }


    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LL list=new LL();

        list.addFirst("a");
        list.addFirst("b");
        System.out.println("Added a and b in front");
       list.PrintList();

       list.addLast("c");
       list.addLast("d");
       System.out.println("Added c and d at rear");
       list.PrintList();

       list.deleteFirst();
       System.out.println("delete first node");
       list.PrintList();

       list.deleteLast();
       System.out.println("deleted last node");
       list.PrintList();

       System.out.println(list.getSize());

       list.addLast("e");
       list.PrintList();
       System.out.println(list.getSize());
    }
    
}
