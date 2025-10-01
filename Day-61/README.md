\# 🚀 Day 60 – DSA Challenge



\# Singly Linked List Implementation in Java



This project demonstrates a simple implementation of a \*\*singly linked list\*\* in Java.  

It supports:

\- Adding a node at the beginning (`addFirst`)

\- Adding a node at the end (`addLast`)

\- Traversing and printing the list (`printNode`)



---



\## 📌 Problem Description

A linked list is a linear data structure where elements (nodes) are connected using pointers.  

Each node contains:

\- `data` → the value stored in the node

\- `next` → a reference to the next node



This program implements a minimal version of a linked list with basic operations.



---



\## 📂 Classes and Structure

\### `LL`

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



\- \*\*`printNode()`\*\*  

&nbsp; Traverses the list and prints all nodes in the format:  

data1->data2->...->Null





---



\## ✅ Example



\### Code Execution

```java

public static void main(String\[] args) {

&nbsp; LL l = new LL();

&nbsp; l.addFirst(10);

&nbsp; l.printNode();

&nbsp; l.addLast(20);

&nbsp; l.printNode();

}



10->Null

10->20->Null



\## Java Solution



```java



public class LL {

&nbsp;   Node head;

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

&nbsp;       newNode.next = null;

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



&nbsp;   //traverse and print

&nbsp;   public void printNode(){

&nbsp;       if(head==null){

&nbsp;           System.out.println("Head is empty");

&nbsp;       }

&nbsp;       Node currNode = head;

&nbsp;       while (currNode!=null) {

&nbsp;           System.out.print(currNode.data +"->");

&nbsp;           currNode=currNode.next;

&nbsp;       }

&nbsp;       System.out.println("Null");

&nbsp;   }





&nbsp;   public static void main(String\[] args) {

&nbsp;       LL l = new LL();

&nbsp;       l.addFirst(10);

&nbsp;       l.printNode();

&nbsp;       l.addLast(20);

&nbsp;       l.printNode();

&nbsp;   }

&nbsp;   

}



\### ✅ Next Goal:



I will continue the same new quest according to the array as well as the string and Linked list



