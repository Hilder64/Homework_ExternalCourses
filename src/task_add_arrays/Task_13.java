package task_add_arrays;

import static task_add_arrays.ArrayOperations.fillArray;
import static task_add_arrays.ArrayOperations.getArray;

public class Task_13 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr, -10, 10);
        System.out.println(getArray(arr));
        System.out.println(getLastNegativeValue(arr));
    }

    private static int getLastNegativeValue(int[] arr) {
        for (int i = arr.length - 1; i > -1; i--) {
            if (arr[i] < 0) {
                return arr[i];
            }
        }
        return 0;
    }
}
