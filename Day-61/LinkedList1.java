public class LL {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
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

    //traverse and print
    public void printNode(){
        if(head==null){
            System.out.println("Head is empty");
        }
        Node currNode = head;
        while (currNode!=null) {
            System.out.print(currNode.data +"->");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }


    public static void main(String[] args) {
        LL l = new LL();
        l.addFirst(10);
        l.printNode();
        l.addLast(20);
        l.printNode();
    }
    
}
