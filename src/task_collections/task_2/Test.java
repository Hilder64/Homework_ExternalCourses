package task_collections.task_2;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new MyArrayList<>();
        int[] arr = {4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7};
        for (int value : arr) {
            list.add(value);
        }

        list.remove(3);
    }
}
