package task_add_arrays;

import static task_add_arrays.ArrayOperations.fillArray;
import static task_add_arrays.ArrayOperations.getArray;
import static task_add_arrays.Task_1.getSum;


public class Task_4 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        fillArray(arr, -10, 10);
        System.out.println(getArray(arr));
        System.out.println(getAverageOfArray(arr));
    }

    static double getAverageOfArray(int[] arr) {
        return (double) getSum(arr) / arr.length;
    }
}
