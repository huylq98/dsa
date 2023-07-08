package vn.com.huylq.datastructures.linkedlist.doubly;

public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode createDLL(int nodeValue) {
        DoublyNode node = new DoublyNode(nodeValue);
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public DoublyNode insert(int nodeValue, int location) {
        if (head == null) {
            System.out.println("Linked List does not existed");
            return createDLL(nodeValue);
        }
        if (location == 0) {
            DoublyNode node = new DoublyNode(nodeValue);
            node.next = head;
            head.prev = node;
            head = node;
        } else if (location >= size) {
            DoublyNode node = new DoublyNode(nodeValue);
            node.prev = tail;
            tail.next = node;
            tail = node;
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            DoublyNode node = new DoublyNode(nodeValue);
            node.prev = tempNode;
            node.next = tempNode.next;
            tempNode.next = node;
            node.next.prev = node;
        }
        size++;
        return head;
    }

    public void traverse() {
        if (head == null) {
            System.out.println("Linked List does not exist");
        } else {
            DoublyNode curr = head;
            while (curr != null) {
                System.out.print(curr.value);
                if (curr.next != null) {
                    System.out.print(" <-> ");
                }
                curr = curr.next;
            }
            System.out.println();
        }
    }

    public void reverseTraverse() {
        if (head == null) {
            System.out.println("Linked List does not exist");
        } else {
            DoublyNode curr = tail;
            while (curr != null) {
                System.out.print(curr.value);
                if (curr.prev != null) {
                    System.out.print(" <-> ");
                }
                curr = curr.prev;
            }
            System.out.println();
        }
    }

    public boolean search(int value) {
        if (head != null) {
            DoublyNode curr = head;
            for (int i = 0; i < size; i++) {
                if (curr.value == value) {
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
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
        } else if (location >= size) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        } else {
            DoublyNode curr = head;
            for (int i = 0; i < location - 1; i++) curr = curr.next;
            curr.next = curr.next.next;
            curr.next.prev = curr;
            size--;
        }
    }

    public void deleteDLL() {
        DoublyNode curr = head;
        for (int i = 0; i < size; i++) {
            curr.prev = null;
            curr = curr.next;
        }
        head = null;
        tail = null;
        size = 0;
    }
}
