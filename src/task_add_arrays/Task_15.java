package task_add_arrays;

import static task_add_arrays.ArrayOperations.*;

public class Task_15 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        fillArray(arr, 0, 10);
        System.out.println(getArray(arr));
        System.out.println(getArray(findIndexesEntryElement(arr, 2)));

    }

    private static int[] findIndexesEntryElement(int[] arr, int element) {
        int[] indexes = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                indexes = addValueToArray(indexes, i);
            }
        }
        return indexes;
    }
}
