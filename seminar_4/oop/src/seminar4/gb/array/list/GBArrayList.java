package seminar4.gb.array.list;

import seminar4.gb.array.GBList;

import java.util.Iterator;

public class GBArrayList<T> implements GBList<T> {

    private T[] values;

    public GBArrayList() {
        this.values = (T[]) new Object[0];
    }

    @Override
    public boolean add(T t) {
        // код без try-catch будет работать, но
        // блок try-catch нужен из-за операции down-каста, нужно как-то обработать исключения
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length + 1];
            //откуда -> с какого элемента -> куда -> с какого элемента -> сколько
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = t;
            return true;
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void remove(int index) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElementsAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amountElementsAfterIndex);
        } catch (ClassCastException e) {
           throw new RuntimeException(e);
        }
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, T type) {
        values[index] = type;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(values);
    }
}
