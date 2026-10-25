package com.linkedlist;

public class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head = null;
    Node tail = null;

    void insertEndTheHead(int data){
        if(head == null && tail == null){
            Node newNode = new Node(data);

            head = newNode;
            tail = newNode;
        }
//        list not empty
        else{
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;

        }
    }

    void insertAtTail(int value) {

        // Linked List empty
        if (head == null && tail == null) {

            Node newNode = new Node(value);

            head = newNode;
            tail = newNode;
        }// Linked List not empty
        else {

            Node newNode = new Node(value);

            // Old tail ko new node se connect
            tail.next = newNode;

            // Tail update
            tail = newNode;
        }
    }


    // Print Linked List
    void printL(){

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println("NULL");
    }


    static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertEndTheHead(1);
        list.insertEndTheHead(2);
        list.insertEndTheHead(3);
        list.insertEndTheHead(4);

        list.printL();
    }
}
