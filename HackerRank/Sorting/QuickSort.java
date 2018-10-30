package HackerRank.Sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 5, 2, 7, 4, 9, 12, 1, 8, 6, 11, 3};
//        int[] arr = new int[]{10, 5, 2, 7};
        quickSort(arr);
        printArray(arr);
    }

    public static void printArray(int[] array) {
        System.out.println();
        for(int i : array) {
            System.out.printf("%5d", i);
        }
    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    public static void quickSort(int[] array, int left, int right) {
        if(left >= right) {
            return;
        }
//        int pivot = array[(left + right) / 2];
        int pivot = array[(left + ((right - left) / 2))];
        int index = partition(array, pivot, left, right);
        quickSort(array, left, index - 1);
        quickSort(array, index, right);
    }

    public static int partition(int[] array, int pivot, int left, int right) {
        while(left <= right) {
            while(array[left] < pivot) {
                left++;
            }
            while(array[right] > pivot) {
                right--;
            }
            if(left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
