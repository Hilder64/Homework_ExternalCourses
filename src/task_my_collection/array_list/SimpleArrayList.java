package task_my_collection.array_list;

import java.util.Iterator;

public class SimpleArrayList<E> implements Simple<E> {

    public static void main(String[] args) {
        Simple<String> list = new SimpleArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        System.out.println(list.get(1));
        System.out.println(list.size());
        list.update(1, "update");
        System.out.println(list.get(1));

        list.delete(1);
        System.out.println(list.size());
        System.out.println(list.get(1));
    }

    private E[] values;

    public SimpleArrayList() {
        this.values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E element) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = element;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public void delete(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int amountElementsAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amountElementsAfterIndex);
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E element) {
        values[index] = element;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }
}
