package task_add_arrays;

import static task_add_arrays.ArrayOperations.*;
import static task_add_arrays.Task_5.getNumberOfEqualValue;

public class Task_21 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr, -10, 10);
        System.out.println(getArray(arr));
        System.out.println(getArray(getElementsNoEqualOther(arr)));
    }

    private static int[] getElementsNoEqualOther(int[] arr) {
        int[] elements = new int[0];
        for (int i = 0; i < arr.length; i++) {
            //int element = arr[i];
                if (getNumberOfEqualValue(arr, arr[i]) == 1) {
                    elements = addValueToArray(elements, arr[i]);
                }
            }

        return elements;
    }
}
