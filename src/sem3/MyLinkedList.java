package sem3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> implements Iterable<T>{
    private Node<T> head = null;

    public void append(T data){

        if (head == null) {
            head = new Node<>(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node<T> newNode = new Node<>(data);
            current.next = newNode;
            newNode.previous = current;
        }
    }

    public void delete(T data) {
        if (head == null) {
            return;
        }

        if (head.value == data) {
            head = head.next;
            if (head != null) {
                head.previous = null;
            }
            return;
        }

        Node<T> current = head;
        while (current != null && current.value != data) {
            current = current.next;
        }

        if (current == null) {
            return;
        }

        if (current.previous != null) {
            current.previous.next = current.next;
        }
        if (current.next != null) {
            current.next.previous = current.previous;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current.next != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }

                T value = current.value;
                current = current.next;
                return value;

            }
        };
    }
}


class Node <T>{

    public T value;
    public Node previous = null;
    public Node next = null;

    Node(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
