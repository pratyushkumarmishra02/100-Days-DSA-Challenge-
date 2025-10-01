\# 🚀 Day 61 – DSA Challenge



\# Singly Linked List Implementation in Java



This project demonstrates a simple implementation of a \*\*singly linked list\*\* in Java.  

It supports:

\- Adding nodes at the beginning (`addFirst`)

\- Adding nodes at the end (`addLast`)

\- Deleting the first node (`deleteFirst`)

\- Deleting the last node (`deleteLast`)

\- Traversing and printing the list (`printNode`)



---



\## 📌 Problem Description

A \*\*linked list\*\* is a linear data structure where elements (nodes) are connected using pointers.  

Each node contains:

\- `data` → the value stored in the node

\- `next` → a reference to the next node  



This program demonstrates insertion, deletion, and traversal operations on a singly linked list.



---



\## 📂 Classes and Structure

\### `LL1`

\- Main class containing the `head` node and linked list operations.



\### `Node`

\- Inner class representing each node of the linked list.  

\- Fields:

&nbsp; - `int data`  

&nbsp; - `Node next`



---



\## 🛠 Methods

\- \*\*`addFirst(int data)`\*\*  

&nbsp; Adds a new node at the \*\*beginning\*\* of the list.  



\- \*\*`addLast(int data)`\*\*  

&nbsp; Adds a new node at the \*\*end\*\* of the list.  



\- \*\*`deleteFirst()`\*\*  

&nbsp; Deletes the \*\*first node\*\* in the list.  



\- \*\*`deleteLast()`\*\*  

&nbsp; Deletes the \*\*last node\*\* in the list.  



\- \*\*`printNode()`\*\*  

&nbsp; Traverses the list and prints all nodes in the format:  

data1->data2->...->Null





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

}





\## Java Solution



```java



public class LinkedList2 {



&nbsp;    Node head;

&nbsp;   class Node{

&nbsp;       int data;

&nbsp;       Node next;

&nbsp;       Node(int data){

&nbsp;           this.data=data;

&nbsp;           this.next=null;

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

&nbsp;       head=head.next;

&nbsp;   }



&nbsp;   //delete last

&nbsp;   public void deleteLast(){

&nbsp;       if (head==null) {

&nbsp;           System.out.println("List is null");

&nbsp;       }

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

&nbsp;   }

&nbsp;   

}

\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list

