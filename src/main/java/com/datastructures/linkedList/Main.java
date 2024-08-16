package com.datastructures.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();

        linkedList.append(3);
        linkedList.append(10);

        linkedList.printList();


    }
}
