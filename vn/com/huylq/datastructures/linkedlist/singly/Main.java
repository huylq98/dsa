package vn.com.huylq.datastructures.linkedlist.singly;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Node head = singlyLinkedList.createSinglyLinkedList(1);
        System.out.println(head.value);
        head = singlyLinkedList.insert(2, 0);
        System.out.println(head.value);
        head = singlyLinkedList.insert(3, 10);
        System.out.println(head.value);
        System.out.println(singlyLinkedList.tail.value);
        head = singlyLinkedList.insert(4, 2);
        System.out.println(head.next.next.value);
        singlyLinkedList.traverse();
        singlyLinkedList.delete(1);
        singlyLinkedList.traverse();
        singlyLinkedList.delete(10);
        singlyLinkedList.traverse();
        singlyLinkedList.delete(0);
        singlyLinkedList.traverse();
    }
}
