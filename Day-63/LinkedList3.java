public class LinkedList3 {
     Node head;
     private int size;
     LL1(){
        this.size = 0;
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

    //add node at 1st 
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add node at last 
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        Node cuNode = head;
        while (cuNode.next!=null) {
            cuNode=cuNode.next;
        }
        cuNode.next = newNode;
    }

    //delete first
    public void deleteFIrst(){
        if(head==null){
            System.out.println("List is null");
            return;
        }
        size--;
        head=head.next;
    }

    //delete last
    public void deleteLast(){
        if (head==null) {
            System.out.println("List is null");
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while(last.next!=null){
            secondLast=secondLast.next;
            last=last.next;
        }
        secondLast.next=null;
    }

    //traverse and print
    public void printNode(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node currNode = head;
        while (currNode!=null) {
            System.out.print(currNode.data +"->");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }

    //for size
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LL1 l = new LL1();
        l.addFirst(10);
        l.printNode();
        l.addLast(20);
        l.printNode();
        l.addFirst(0);
        l.printNode();
        l.deleteFIrst();
        l.printNode();
        l.deleteLast();
        l.printNode();
        System.out.println(l.getSize());
    }
    
}
