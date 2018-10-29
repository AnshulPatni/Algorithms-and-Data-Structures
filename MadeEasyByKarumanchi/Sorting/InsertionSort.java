package Algorithms.AlgorithmsAndDataStructures.MadeEasyByKarumanchi.Sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 5, 2, 7, 4, 9, 12, 1, 8, 6, 11, 3};
        insertionSort(arr);
        printArray(arr);
    }

    public static void printArray(int[] array) {
        System.out.println();
        for(int i : array) {
            System.out.printf("%5d", i);
        }
    }

    public static void insertionSort(int[] arr) {
        int j, val;
        for(int i = 1; i < arr.length; i++) {
            val = arr[i];
            j = i;
            while(j >= 1 && arr[j-1] > val) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = val;
        }
    }

}
