package task_add_arrays;

import static task_add_arrays.ArrayOperations.fillArray;
import static task_add_arrays.ArrayOperations.getArray;

public class Task_10 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr, -10, 10);
        System.out.printf(getArray(arr));
        setZeroValuePositiveElements(arr);
        System.out.printf(getArray(arr));
    }

    private static void setZeroValuePositiveElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[i] = 0;
            }
        }
    }
}
