package ua.epam.qa.lesson09.example;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class LinkedListNode<T extends Comparable<T>> implements Iterable<T>, Comparable<LinkedListNode<T>> {
    ListNode<T> head;

    public LinkedListNode() {
        head = null;
    }

    public void addFirst(T data){
        ListNode node = new ListNode(data);
        if (head == null){
            head = node;
        }
        else{
            node.next = head;
            head = node;
        }
    }
    public T removeFirst(){
        if (head!= null){
            T data = head.data;
            head = head.next;
            return data;
        }
        return null;
    }
    public void print(){
        System.out.println("***************************");
        ListNode iter = head;
        while (iter != null){
            System.out.println(iter.data);
            iter = iter.next;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ListNodeIterator();
    }

    @Override
    public int compareTo(LinkedListNode<T> other) {
        if (other == null) return 1;
        ListNode iterThis = head;
        ListNode iterOther = other.head;
        while (iterThis != null && iterOther!=null){
            if (iterThis.data.compareTo(iterOther.data)==0){
            iterThis = iterThis.next;
            iterOther = iterOther.next;}
            else return (iterThis.data).compareTo(iterOther.data);
        }
        if (iterThis != null) return 1;
        if (iterOther!= null) return -1;
        return 0;
    }

    private class ListNodeIterator implements Iterator<T>{
        ListNode<T> iter;

        public ListNodeIterator() {
            iter = head;
        }
        @Override
        public boolean hasNext() {
            return iter != null;
        }

        @Override
        public T next() {
            T data = iter.data;
            iter = iter.next;
            return data;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
