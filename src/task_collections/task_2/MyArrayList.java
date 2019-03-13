package task_collections.task_2;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class MyArrayList<E> extends ArrayList<E> {
    public MyArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public MyArrayList() {
        super();
    }

    public MyArrayList(Collection<? extends E> c) {
        super(c);
    }

    @Override
    @Deprecated
    public E remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public boolean removeIf(Predicate<? super E> filter) {
        throw new UnsupportedOperationException();
    }
}
