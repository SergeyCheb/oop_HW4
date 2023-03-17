package seminar4.gb.array.list;

import seminar4.gb.array.HWList;

import java.util.Iterator;

public class HWLinkedListIterator<T> implements Iterator<T> {
    private int index;
    private final HWLinkedList<T> values;

    public HWLinkedListIterator(HWLinkedList<T> values) {
        index = 0;
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.getSize();
    }

    @Override
    public T next() {
        return values.getAt(index++);
    }
}

