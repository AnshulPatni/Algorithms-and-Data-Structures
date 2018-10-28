package Algorithms.AlgorithmsAndDataStructures.HackerRank.Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 10, 5, 12, 9, 20};
        bubbleSort(arr);
        for(int i : arr) {
            System.out.printf("%5d", i);
        }
    }

    public static void bubbleSort(int[] arr) {
        boolean isSorted = false;
        int iterations = arr.length - 1;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < iterations; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    isSorted = false;
                }
            }
            iterations--;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
