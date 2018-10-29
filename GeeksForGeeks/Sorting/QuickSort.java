package Algorithms.AlgorithmsAndDataStructures.GeeksForGeeks.Sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 5, 2, 7, 4, 9, 12, 1, 8, 6, 11, 3};
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

    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            // partitioning index
            int pi = partition(arr, low, high);

            quickSort(arr, low,pi-1);
            quickSort(arr, pi+1,high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j = low; j < high; j++) {
            if(arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
