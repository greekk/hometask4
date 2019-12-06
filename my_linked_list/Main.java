package com.greekk.hometask4.my_linked_list;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        MyLinkedList myLinkedListTwo = new MyLinkedList();

        myLinkedList.add(3);
        myLinkedList.add(2);
        myLinkedList.add(1);
        myLinkedList.add(5);
        myLinkedList.add(37);
        myLinkedList.add(4);
        Node node;

        while ((node = myLinkedList.next())!=null){
            System.out.println(node.data);
        }
        while ((node = myLinkedListTwo.next())!=null){
            System.out.println(node.data);
        }
    }

}
