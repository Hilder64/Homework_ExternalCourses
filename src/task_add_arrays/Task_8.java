package task_add_arrays;

import static task_add_arrays.ArrayOperations.fillArray;
import static task_add_arrays.ArrayOperations.getArray;

public class Task_8 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr, -10, 10);
        System.out.printf(getArray(arr));
        multipleArrayToNumber(arr, 3);
        System.out.println(getArray(arr));
    }

    private static void multipleArrayToNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= number;
        }
    }
}
