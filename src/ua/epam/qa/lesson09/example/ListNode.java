package ua.epam.qa.lesson09.example;

public class ListNode<T extends Comparable<T>> {
    T data;
    ListNode next;

    public ListNode(T data) {
        this.data = data;
        this.next = null;
    }
}
