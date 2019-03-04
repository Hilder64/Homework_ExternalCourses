package task_add_arrays;

import static task_add_arrays.ArrayOperations.fillArray;
import static task_add_arrays.ArrayOperations.getArray;

public class Task_5 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        fillArray(arr, 0, 10);
        System.out.printf(getArray(arr));
        System.out.println(getNumberOfEqualValue(arr, 3));
    }

    static int getNumberOfEqualValue(int[] arr, int value) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                count++;
            }
        }
        return count;
    }
}
