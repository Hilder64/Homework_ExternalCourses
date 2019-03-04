package task_add_arrays;

import static task_add_arrays.ArrayOperations.*;

public class Task_19 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        fillArray(arr, -10, 10);
        System.out.println(getArray(arr));
        System.out.println(getArray(getElementsEqualOther(arr)));
    }

    private static int[] getElementsEqualOther(int[] arr) {
        int[] elements = new int[0];
        for (int i = 0; i < arr.length; i++) {
            //int element = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    if (!checkArrToEqualValue(elements, arr[i])){
                        elements = addValueToArray(elements, arr[i]);
                        break;
                    }
                }
            }
        }
        return elements;
    }

    static boolean checkArrToEqualValue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }
}
