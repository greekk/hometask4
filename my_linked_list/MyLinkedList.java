package com.greekk.hometask4.my_linked_list;

public class MyLinkedList {
    private Node last = null;
    private Node next = null;

    public void add(int data){
        Node node = new Node();
        node.data = data;

        if(this.last != null){
            node.nextNode = last;
        }
        last = node;
    }

    public Node next(){
        if(this.next != null ){
            if(this.next.nextNode!=null){
                this.next = next.nextNode;
            }
            else{
                System.out.println("End of the list!");
                return null;
            }
        }
        else{
            if (this.last != null) {
                next = last;
            }
            else{
                System.out.println("List is empty!");
                return null;
            }
        }

        return next;
    }
}
