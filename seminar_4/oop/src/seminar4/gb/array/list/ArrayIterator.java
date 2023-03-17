package seminar4.gb.array.list;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    private int index;
    private final T[] values;

    public ArrayIterator(T[] values) {
        index = 0;
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public T next() {
        return values[index++];
    }
}
