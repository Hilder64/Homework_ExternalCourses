package task_add_arrays;

import static task_add_arrays.ArrayOperations.fillArray;
import static task_add_arrays.ArrayOperations.getArray;

public class Task_1 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        fillArray(arr1, -10, 10);
        System.out.println(getArray(arr1));
        System.out.println(getSum(arr1));
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


}
