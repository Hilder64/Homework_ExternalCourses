package task_add_arrays;

import static task_add_arrays.ArrayOperations.fillArray;
import static task_add_arrays.ArrayOperations.getArray;

public class Task_12 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr, -10, 10);
        System.out.printf(getArray(arr));
        System.out.println(getFirstPositiveValue(arr));
    }

    private static int getFirstPositiveValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                return arr[i];
            }
        }
        return 0;
    }
}
