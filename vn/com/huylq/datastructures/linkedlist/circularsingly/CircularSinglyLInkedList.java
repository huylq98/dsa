package vn.com.huylq.datastructures.linkedlist.circularsingly;

public class CircularSinglyLInkedList {
    Node head;
    Node tail;
    int size;

    public Node createCircularSinglyLinkedList(int nodeValue) {
        Node node = new Node(nodeValue);
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insert(int nodeValue, int location) {
        if (head == null) {
            createCircularSinglyLinkedList(nodeValue);
            return;
        }
        Node node = new Node(nodeValue);
        if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            node.next = tail.next;
            tail.next = node;
            tail = node;
        } else {
            int index = 0;
            Node curr = head;
            while (index < location - 1) {
                curr = curr.next;
                index++;
            }
            node.next = curr.next;
            curr.next = node;
        }
        size++;
    }

    public void traverse() {
        if (head == null) {
            System.out.println("Linked List does not exist.");
        } else {
            Node curr = head;
            do {
                System.out.print(curr.value);
                if (curr.next != head) System.out.print(" -> ");
                curr = curr.next;
            } while (curr != head);
            System.out.println();
        }
    }

    public boolean search(int nodeValue) {
        if (head != null) {
            Node curr = head;
            for (int i = 0; i < size; i++) {
                if (curr.value == nodeValue) {
                    System.out.println("Node found at index " + i);
                    return true;
                }
                curr = curr.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    public void delete(int location) {
        if (head == null) {
            System.out.println("Linked List does not exist");
            return;
        }
        if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                head.next = null;
                head = null;
                tail = null;
            }
        } else if (location >= size) {
            Node curr = head;
            for (int i = 0; i < size - 2; i++) {
                curr = curr.next;
            }
            curr.next = head;
            tail = curr;
            size--;
            if (size == 0) {
                head.next = null;
                head = null;
                tail = null;
            }
        } else {
            Node curr = head;
            for (int i = 0; i < location - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
            size--;
        }
    }

    public void deleteCSLL() {
        if (head == null) {
            System.out.println("Linked List does not exist.");
        } else {
            head = null;
            tail.next = null;
            tail = null;
            size = 0;
            System.out.println("Linked List is deleted successfully");
        }
    }
}
