package task_add_arrays;

import static task_add_arrays.ArrayOperations.fillArray;
import static task_add_arrays.ArrayOperations.getArray;

public class Task_11 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr, -10, 10);
        System.out.printf(getArray(arr));
        setZeroOddIndex(arr);
        System.out.printf(getArray(arr));
    }

    private static void setZeroOddIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++)  {
            if ((i & 1) == 1) {
                arr[i] = 0;
            }
        }
    }
}
