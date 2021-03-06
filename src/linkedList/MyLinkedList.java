package linkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        TestLinkedList ll = new TestLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4, 9);
        ll.add(4, 9);
        ll.printList();
    }
}
