package seminar4.gb.array;

public interface HWList<T> extends Iterable<T>{
    boolean addToBegin(T t);
    boolean addToEnd(T t);
    int getSize();
    T getAt(int index);
}
