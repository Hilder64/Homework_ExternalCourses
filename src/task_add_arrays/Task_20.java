package task_add_arrays;

import static task_add_arrays.ArrayOperations.*;

public class Task_20 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr, -10, 10);
        System.out.println(getArray(arr));
        System.out.println(Task_4.getAverageOfArray(arr));
        System.out.println(getNumberMoreAverage(arr));

    }

    private static int getNumberMoreAverage(int[] arr) {
        double average = Task_4.getAverageOfArray(arr);
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                counter++;
            }
        }
        return counter;
    }
}
