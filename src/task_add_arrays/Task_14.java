package task_add_arrays;

import static task_add_arrays.ArrayOperations.fillArray;
import static task_add_arrays.ArrayOperations.getArray;
import static task_add_arrays.Task_5.getNumberOfEqualValue;

public class Task_14 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr, 0, 10);
        System.out.println(getArray(arr));
        System.out.println(getNumberOfEqualValue(arr, 5));
    }
}
