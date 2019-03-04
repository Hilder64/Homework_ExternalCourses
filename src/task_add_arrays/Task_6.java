package task_add_arrays;

import static task_add_arrays.ArrayOperations.fillArray;
import static task_add_arrays.ArrayOperations.getArray;

public class Task_6 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        fillArray(arr, -10, 10);
        System.out.printf(getArray(arr));
        System.out.println(getNumberOfEqualZero(arr));
    }

    private static int getNumberOfEqualZero(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        return count;
    }
}
