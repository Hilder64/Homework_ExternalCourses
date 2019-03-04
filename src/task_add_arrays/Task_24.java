package task_add_arrays;

import static task_add_arrays.ArrayOperations.*;

public class Task_24 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        fillArray(arr1, -10, 10);
        int[] arr2 = new int[7];
        fillArray(arr2, -10, 10);
        quickSort(arr1, ArraySortingType.INCREASE);
        quickSort(arr2, ArraySortingType.INCREASE);
        System.out.println(getArray(arr1));
        System.out.println(getArray(arr2));

        System.out.println(getArray(getSortedArray(arr1, arr2)));

    }

    private static int[] getSortedArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];

        if (arr1.length > arr2.length) {
            int[] temp = arr1;
            arr1 = arr2;
            arr2 = temp;
        }
        int j = 0;
        int k = 0;
        for (int i = 0; i < res.length; i++) {
            if (arr1[j] <= arr2[k]) {
                res[i] = arr1[j];
                if (j + 1 < arr1.length) {
                    j++;
                }
            } else {
                res[i] = arr2[k];
                if (k + 1 < arr2.length) {
                    k++;
                }
            }
        }
        return res;
    }
}
