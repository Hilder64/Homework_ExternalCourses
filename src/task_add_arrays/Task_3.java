package task_add_arrays;

import static task_add_arrays.ArrayOperations.fillArray;
import static task_add_arrays.ArrayOperations.getArray;

public class Task_3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr, -10, 10);
        System.out.println(getArray(arr));
        System.out.println("[" + getIndexOfMinValue(arr) + "]" + " " + getMinValue(arr));
    }

    private static int getMinValue(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    private static int getIndexOfMinValue(int[] arr) {
        int indexOfMIn = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[indexOfMIn] > arr[i]) {
                indexOfMIn = i;
            }
        }
        return indexOfMIn;
    }
}
