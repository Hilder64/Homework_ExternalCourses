package task_add_arrays;

import static task_add_arrays.ArrayOperations.*;
import static task_add_arrays.Task_5.getNumberOfEqualValue;

public class Task_23 {

    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        fillArray(arr1, -10, 10);
        System.out.println(getArray(arr1));
        fillArray(arr2, -10, 10);
        System.out.println(getArray(arr2));

        System.out.println(countEqualElements(arr1, arr2));
    }

    private static int countEqualElements(int[] arr1, int[] arr2) {
        int counter = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (getNumberOfEqualValue(arr2, arr1[i]) > 0) {
                counter++;
            }
        }
        return counter;
    }
}
