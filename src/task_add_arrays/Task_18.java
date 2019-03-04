package task_add_arrays;

import static task_add_arrays.ArrayOperations.fillArray;
import static task_add_arrays.ArrayOperations.getArray;

public class Task_18 {
    public static void main(String[] args) {
        int[] arr = new int[9];
        fillArray(arr, -10, 10);
        System.out.println(getArray(arr));
        shiftArrayElementsRight(arr, 327);
        System.out.println(getArray(arr));
    }

    private static void shiftArrayElementsRight(int[] arr, int numberPositions) {
        numberPositions %= arr.length;
        int[] temp1 = new int[arr.length - numberPositions];
        int[] temp2 = new int[numberPositions];
        System.arraycopy(arr, 0, temp1, 0, temp1.length);
        System.arraycopy(arr, temp1.length, temp2, 0, temp2.length);
        System.arraycopy(temp2, 0, arr, 0, temp2.length);
        System.arraycopy(temp1, 0, arr, temp2.length, temp1.length);
    }
}
