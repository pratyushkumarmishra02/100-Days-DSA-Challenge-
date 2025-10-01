\# 🚀 Day 63 – DSA Challenge





\# Singly Linked List Implementation in Java (with Size Tracking)



This project demonstrates a simple \*\*singly linked list\*\* implementation in Java.  

It supports:

\- Adding nodes at the beginning (`addFirst`)

\- Adding nodes at the end (`addLast`)

\- Deleting the first node (`deleteFirst`)

\- Deleting the last node (`deleteLast`)

\- Traversing and printing the list (`printNode`)

\- Getting the size of the list (`getSize`)



---



\## 📌 Problem Description

A \*\*linked list\*\* is a linear data structure where elements (nodes) are connected using references.  

Each node contains:

\- `data` → value stored in the node  

\- `next` → pointer to the next node  



This program also maintains a `size` field to keep track of the number of elements in the list.



---



\## 📂 Classes and Structure

\### `LL1`

\- The main class containing:

&nbsp; - `Node head` → the first node of the list  

&nbsp; - `int size` → the current size of the list  

&nbsp; - Methods for insertion, deletion, printing, and size retrieval  



\### `Node`

\- Inner class representing each node of the linked list.  

\- Fields:

&nbsp; - `int data` → the value  

&nbsp; - `Node next` → reference to the next node  



---



\## 🛠 Methods

\- \*\*`addFirst(int data)`\*\*  

&nbsp; Adds a new node at the \*\*beginning\*\* of the list.  



\- \*\*`addLast(int data)`\*\*  

&nbsp; Adds a new node at the \*\*end\*\* of the list.  



\- \*\*`deleteFirst()`\*\*  

&nbsp; Deletes the \*\*first node\*\* of the list.  



\- \*\*`deleteLast()`\*\*  

&nbsp; Deletes the \*\*last node\*\* of the list.  



\- \*\*`printNode()`\*\*  

&nbsp; Prints the list in the format:  

data1->data2->...->Null





\- \*\*`getSize()`\*\*  

Returns the number of elements currently in the list.  



---



\## ✅ Example



\### Code Execution

```java

public static void main(String\[] args) {

&nbsp; LL1 l = new LL1();

&nbsp; l.addFirst(10);

&nbsp; l.printNode();

&nbsp; l.addLast(20);

&nbsp; l.printNode();

&nbsp; l.addFirst(0);

&nbsp; l.printNode();

&nbsp; l.deleteFirst();

&nbsp; l.printNode();

&nbsp; l.deleteLast();

&nbsp; l.printNode();

&nbsp; System.out.println(l.getSize());

}





10->Null

10->20->Null

0->10->20->Null

10->20->Null

10->Null

1





\## Java Solution



```java



public class LinkedList3 {

&nbsp;    Node head;

&nbsp;    private int size;

&nbsp;    LL1(){

&nbsp;       this.size = 0;

&nbsp;    }

&nbsp;   class Node{

&nbsp;       int data;

&nbsp;       Node next;

&nbsp;       Node(int data){

&nbsp;           this.data=data;

&nbsp;           this.next=null;

&nbsp;           size++;

&nbsp;       }

&nbsp;   }



&nbsp;   //add node at 1st 

&nbsp;   public void addFirst(int data){

&nbsp;       Node newNode = new Node(data);

&nbsp;       if(head==null){

&nbsp;           head=newNode;

&nbsp;           return;

&nbsp;       }

&nbsp;       newNode.next = head;

&nbsp;       head = newNode;

&nbsp;   }



&nbsp;   //add node at last 

&nbsp;   public void addLast(int data){

&nbsp;       Node newNode = new Node(data);

&nbsp;       if(head==null){

&nbsp;           head=newNode;

&nbsp;       }

&nbsp;       Node cuNode = head;

&nbsp;       while (cuNode.next!=null) {

&nbsp;           cuNode=cuNode.next;

&nbsp;       }

&nbsp;       cuNode.next = newNode;

&nbsp;   }



&nbsp;   //delete first

&nbsp;   public void deleteFIrst(){

&nbsp;       if(head==null){

&nbsp;           System.out.println("List is null");

&nbsp;           return;

&nbsp;       }

&nbsp;       size--;

&nbsp;       head=head.next;

&nbsp;   }



&nbsp;   //delete last

&nbsp;   public void deleteLast(){

&nbsp;       if (head==null) {

&nbsp;           System.out.println("List is null");

&nbsp;       }

&nbsp;       size--;

&nbsp;       if(head.next==null){

&nbsp;           head=null;

&nbsp;           return;

&nbsp;       }

&nbsp;       Node secondLast = head;

&nbsp;       Node last = head.next;

&nbsp;       while(last.next!=null){

&nbsp;           secondLast=secondLast.next;

&nbsp;           last=last.next;

&nbsp;       }

&nbsp;       secondLast.next=null;

&nbsp;   }



&nbsp;   //traverse and print

&nbsp;   public void printNode(){

&nbsp;       if(head==null){

&nbsp;           System.out.println("List is empty");

&nbsp;       }

&nbsp;       Node currNode = head;

&nbsp;       while (currNode!=null) {

&nbsp;           System.out.print(currNode.data +"->");

&nbsp;           currNode=currNode.next;

&nbsp;       }

&nbsp;       System.out.println("Null");

&nbsp;   }



&nbsp;   //for size

&nbsp;   public int getSize(){

&nbsp;       return size;

&nbsp;   }

&nbsp;   public static void main(String\[] args) {

&nbsp;       LL1 l = new LL1();

&nbsp;       l.addFirst(10);

&nbsp;       l.printNode();

&nbsp;       l.addLast(20);

&nbsp;       l.printNode();

&nbsp;       l.addFirst(0);

&nbsp;       l.printNode();

&nbsp;       l.deleteFIrst();

&nbsp;       l.printNode();

&nbsp;       l.deleteLast();

&nbsp;       l.printNode();

&nbsp;       System.out.println(l.getSize());

&nbsp;   }

&nbsp;   

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list

