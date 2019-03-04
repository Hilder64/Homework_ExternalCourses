package task_add_arrays;

import static task_add_arrays.ArrayOperations.*;

public class Task_16 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr, -10, 10);
        System.out.println(getArray(arr));
        System.out.println(checkArrayForElementsIncrease(arr));
        quickSort(arr, ArraySortingType.INCREASE);
        System.out.println(getArray(arr));
        System.out.println(checkArrayForElementsIncrease(arr));
    }

    private static boolean checkArrayForElementsIncrease(int[] arr) {
        int previousElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (previousElement > arr[i]) {
                return false;
            }
            previousElement = arr[i];
        }
        return true;
    }
}
