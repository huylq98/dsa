package vn.com.huylq.datastructures.linkedlist.singly;

public class SinglyLinkedList {
    Node head;
    Node tail;
    int size;

    public Node createSinglyLinkedList(int nodeValue) {
        Node node = new Node(nodeValue);
        head = node;
        tail = node;
        size++;
        return head;
    }

    public Node insert(int nodeValue, int location) {
        Node node = new Node(nodeValue);
        if (head == null) {
            return createSinglyLinkedList(nodeValue);
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
        } else {
            int index = 0;
            Node temp = head;
            while (index < location - 1) {
                temp = temp.next;
                index++;
            }
            Node next = temp.next;
            temp.next = node;
            node.next = next;
        }
        size++;
        return head;
    }

    public void traverse() {
        if (head == null) {
            System.out.println("Linked List is not existed.");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                if (temp.next != null) {
                    System.out.print(" -> ");
                }
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public void delete(int location) {
        if (head == null) {
            System.out.println("Linked List is not existed.");
            return;
        }

        if (location == 0) { // Delete first element
            head = head.next;
            size--;
            if (size == 0) { // Linked List has only one element
                tail = null;
            }
        } else if (location >= size - 1) { // Delete last element
            Node temp = head;
            for (int i = 0; i < size - 2; i++) {
                temp = temp.next;
            }
            if (temp == head) { // Linked List has only one element;
                head = tail = null;
                size--;
                return;
            }
            temp.next = null;
            tail = temp;
            size--;
        } else {
            Node temp = head;
            for (int i = 0; i < location - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }
}
