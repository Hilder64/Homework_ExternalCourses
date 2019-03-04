package task_add_arrays;

import static task_add_arrays.ArrayOperations.fillArray;
import static task_add_arrays.ArrayOperations.getArray;

public class Task_2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr, -10, 10);
        System.out.println(getArray(arr));
        System.out.println("[" + getIndexOfMaxValue(arr) + "]" + " " + getMaxValue(arr));
    }

    private static int getMaxValue(int[] arr) {//IndexOf
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    private static int getIndexOfMaxValue(int[] arr) {
        int indexOfMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[indexOfMax] < arr[i]) {
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }
}
