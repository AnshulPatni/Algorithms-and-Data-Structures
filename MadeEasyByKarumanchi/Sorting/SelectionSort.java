package Algorithms.AlgorithmsAndDataStructures.MadeEasyByKarumanchi.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 5, 2, 7, 4, 9, 12, 1, 8, 6, 11, 3};
        selectionSort(arr);
        printArray(arr);
    }

    public static void printArray(int[] array) {
        System.out.println();
        for(int i : array) {
            System.out.printf("%5d", i);
        }
    }

    public static void selectionSort(int[] arr) {
        for(int i = 0 ; i < arr.length-1; i++) {
            int min = findMin(arr, i);
            if(arr[i] > arr[min]) {
                swap(arr, i , min);
            }
        }
    }

    public static int findMin(int[] arr, int i) {
        int temp = arr[i+1], index = i + 1;
        for(int j = i+1; j < arr.length; j++) {
            if(arr[j] < temp) {
                temp = arr[j];
                index = j;
            }
        }
        return index;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
