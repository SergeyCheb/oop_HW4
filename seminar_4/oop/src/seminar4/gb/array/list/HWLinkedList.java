package seminar4.gb.array.list;

import seminar4.gb.array.HWList;

import java.util.Iterator;

public class HWLinkedList<T> implements HWList<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;

    public HWLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }


    @Override
    public boolean addToBegin(T t) {
        try {
            Node<T> node = new Node(t);
            if (this.first == null) {
                this.last = node;
            } else {
                node.next = this.first;
            }
            this.first = node;
            size++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean addToEnd(T t) {
        try {
            Node<T> node = new Node(t);
            if (this.first == null) {
                this.first = node;
            } else {
                this.last.next = node;
            }
            this.last = node;
            size++;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public T getAt(int index) throws IndexOutOfBoundsException{
        if (index >= 0 && index < this.size) {
            Node<T> desiredNode = this.first;
            for (int i = 0; i < index; ++i) {
                desiredNode = desiredNode.next;
            }
            return desiredNode.element;
        }
        else
            throw new IndexOutOfBoundsException();
    }

    @Override
    public Iterator<T> iterator() {
        return new HWLinkedListIterator<T>(this);
    }

    public void showList() {
        if (this.size == 0)
            System.out.println("список элементов пуст");
        else {
            Node node = this.first;
            int num = 0;
            while (node != null) {
                System.out.println("элемент с индексом " + num++ + ": " + node.element);
                node = node.next;
            }
        }
    }
}

class Node<T> {
    T element;
    Node next;

    public Node(T elem) {
        element = elem;
        next = null;
    }
}
