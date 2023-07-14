package vn.com.huylq.datastructures.linkedlist.circulardouble;

public class CircularDoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode createCDLL(int nodeValue) {
        DoublyNode node = new DoublyNode(nodeValue);
        head = node;
        tail = node;
        head.prev = tail;
        tail.next = head;
        size = 1;
        return head;
    }

    public DoublyNode insert(int nodeValue, int location) {
        if (head == null) {
            return createCDLL(nodeValue);
        }
        DoublyNode node = new DoublyNode(nodeValue);
        if (location == 0) {
            node.next = head;
            node.prev = tail;
            head.prev = node;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            node.prev = tail;
            node.next = head;
            tail.next = node;
            tail = node;
            head.prev = tail;
        } else {
            DoublyNode curr = head;
            for (int i = 0; i < location - 1; i++) curr = curr.next;
            node.prev = curr;
            node.next = curr.next;
            curr.next = node;
            node.next.prev = node;
        }
        size++;
        return head;
    }

    public void traverse() {
        if (head == null) {
            System.out.println("Linked List does not exist");
            return;
        }
        DoublyNode curr = head;
        for (int i = 0; i < size; i++) {
            System.out.print(curr.value);
            if (i != size - 1) System.out.print(" <-> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void reverseTraverse() {
        if (head == null) {
            System.out.println("Linked List does not exist");
            return;
        }
        DoublyNode curr = tail;
        for (int i = 0; i < size; i++) {
            System.out.print(curr.value);
            if (i != size - 1) System.out.print(" <-> ");
            curr = curr.prev;
        }
        System.out.println();
    }

    public boolean search(int nodeValue) {
        if (head != null) {
            DoublyNode curr = head;
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
            if (head == tail) {
                head.prev = null;
                head = null;
                tail.next = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
        } else if (location >= size) {
            if (head == tail) {
                head.prev = null;
                head = null;
                tail.next = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
            }
        } else {
            DoublyNode curr = head;
            for (int i = 0; i < location - 1; i++) curr = curr.next;
            curr.next = curr.next.next;
            curr.next.prev = curr;
        }
        size--;
    }

    public void deleteCDLL() {
        if (head != null) {
            DoublyNode curr = head;
            for (int i = 0; i < size; i++) {
                curr.prev = null;
                curr = curr.next;
            }
            head = null;
            tail.next = null;
            tail = null;
            size = 0;
        }
    }
}
