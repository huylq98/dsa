package vn.com.huylq.datastructures.linkedlist.circulardouble;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        DoublyNode head = cdll.createCDLL(1);
        System.out.println(head.prev.value);
        cdll.insert(2, 0);
        cdll.insert(4, 10);
        cdll.insert(3, 1);
        cdll.insert(7, 5);
        cdll.traverse();
        cdll.reverseTraverse();
        cdll.search(3);
        cdll.search(5);
        cdll.delete(0);
        cdll.traverse();
        cdll.delete(2);
        cdll.traverse();
        cdll.deleteCDLL();
        cdll.traverse();
    }
}
