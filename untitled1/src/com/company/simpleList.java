package com.company;

public class simpleList { //собственный лист

    static private class Node {//элемент листа и ссылка на след. элемент

        public int value; //значение

        public Node next; //ссылка

        public Node(int value, Node next) {//конструктор

            this.value = value;

            this.next = next;

        }

        public Node(int value) {//ещё один конструктор

            this(value, null);

        }
    }

    private Node head = null;  // first, top

    private Node tail = null;  // first, top

    private int size = 0;

    private Node getNode(int index) {

        Node curr = head;

        for (int i = 0; i < index; i++) {

            curr = curr.next;

        }

        return curr;

    }

    public int get(int index) {

        return getNode(index).value;

    }

    public void set(int index, int value) {

        getNode(index).value = value;

    }

    public int size() {

        return size;

    }

    public void add(int value) {

        if (size == 0) {

            head = tail = new Node(value);

        }

        else {

            tail.next = new Node(value);

            tail = tail.next;

        }

        size++;

    }
}
