package vn.com.huylq.datastructures.linkedlist.doubly;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        DoublyNode head = dll.createDLL(2);
        System.out.println(head.value);
        dll.insert(1, 0);
        dll.insert(3, 5);
        dll.insert(4, 1);
        dll.traverse();
        dll.reverseTraverse();
        dll.search(3);
        dll.search(5);
        dll.delete(2);
        dll.traverse();
        dll.delete(0);
        dll.traverse();
        dll.delete(10);
        dll.traverse();
        dll.delete(10);
        dll.traverse();
        dll.insert(2, 1);
        dll.insert(1, 0);
        dll.insert(5, 4);
        dll.insert(3, 0);
        dll.traverse();
        dll.deleteDLL();
        dll.traverse();
    }
}
