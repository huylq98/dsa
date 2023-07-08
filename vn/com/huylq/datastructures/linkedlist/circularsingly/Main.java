package vn.com.huylq.datastructures.linkedlist.circularsingly;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLInkedList cSLL = new CircularSinglyLInkedList();
        Node head = cSLL.createCircularSinglyLinkedList(1);
        System.out.println(head.value);
        cSLL.insert(4, 0);
        cSLL.insert(2, 1);
        cSLL.insert(6, 8);
        System.out.println(cSLL.head.value);
        System.out.println(cSLL.tail.value);
        cSLL.traverse();
        cSLL.search(1);
        cSLL.search(3);
        cSLL.delete(0);
        cSLL.traverse();
        cSLL.delete(1);
        cSLL.traverse();
        cSLL.delete(10);
        cSLL.traverse();
        cSLL.delete(10);
        cSLL.traverse();
        cSLL.insert(2, 3);
        cSLL.insert(1, 2);;
        cSLL.insert(-2, 3);
        cSLL.traverse();
        cSLL.deleteCSLL();
        cSLL.traverse();
        cSLL.deleteCSLL();
    }
}
