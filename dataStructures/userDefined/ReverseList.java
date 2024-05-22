
package dataStructures.userDefined;
public class ReverseList {
    Node head;
    public int size;

    ReverseList(){
        size=0;
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
            size++;

        }
    }

        public void addLast(int data){
            Node newNode=new Node(data);

            if(head==null){
                head=newNode;
                return ;
            }

            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            return ;
        }
        void PrintList(){
            Node temp=head;

            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("NULL");
        }

        public void reverseIterate(){
            Node prev=head;
            Node curr=prev.next;

            if(head==null||head.next==null){
                return;
            }
            
            while(curr!=null){
                Node next=curr.next;
                //reversing link
                curr.next=prev;
                //shifting pointers
                prev=curr;
                curr=next;
            }
            head.next=null;
            head=prev;
        }

        Node reverseRecursive(Node head){
            if(head==null||head.next==null){
                return head;
            }

            Node newHead=reverseRecursive(head.next);
            head.next.next=head;
            head.next=null;
            return newHead;
        }
    
    
    public static void main(String args[]){

        ReverseList list=new ReverseList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.PrintList();
        list.reverseIterate();
        list.PrintList();
        list.head=list.reverseRecursive(list.head);
        list.PrintList();

    }
}
