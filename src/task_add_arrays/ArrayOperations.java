package task_add_arrays;

class ArrayOperations {
    static void fillArray(int[] arr, int minRange, int maxRange) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomIntFromRange(minRange, maxRange);
        }
    }

    private static int getRandomIntFromRange(int min, int max) {
        return (int) Math.ceil(Math.random() * (max - min - 1) + min);
    }

    static String getArray(int[] arr) {
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                res += arr[i] + " ";
            } else {
                res += " " + arr[i] + " ";
            }
            if (i % 10 == 9) {
                res += '\n';
            }
        }
        return res;
    }

    static void quickSort(int[] arr, ArraySortingType type) {
        int begin = 0;
        int end = arr.length - 1;
        quickSort(arr, begin, end, type);
    }

    private static void quickSort(int[] arr, int begin, int end, ArraySortingType type) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end, type);
            quickSort(arr, begin, partitionIndex - 1, type);
            quickSort(arr, partitionIndex + 1, end, type);
        }
    }

    private static int partition(int[] arr, int begin, int end, ArraySortingType type) {
        int pivot = arr[end];
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (type == ArraySortingType.INCREASE) {
                if (arr[j] <= pivot) {
                    i++;

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            } else {
                if (arr[j] >= pivot) {
                    i++;

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return i + 1;
    }

    public static int[] addValueToArray(int[] arr, int value) {
        if (arr.length == 0) {
            arr = new int[]{value};
        } else {
            int[] temp = arr;
            arr = new int[temp.length + 1];
            System.arraycopy(temp, 0, arr, 0, temp.length);
            arr[temp.length] = value;
        }
        return arr;
    }
}
