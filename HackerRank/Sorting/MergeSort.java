package Algorithms.AlgorithmsAndDataStructures.HackerRank.Sorting;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 5, 2, 7, 4, 9, 12, 1, 8, 6, 11, 3};
        mergeSort(arr);
        printArray(arr);
    }

    public static void printArray(int[] array) {
        System.out.println();
        for(int i : array) {
            System.out.printf("%5d", i);
        }
    }

    public static void mergeSort(int[] arr) {
        mergeSort(arr, new int[arr.length],0,arr.length-1);
    }

    public static void mergeSort(int[] array, int[] temp, int leftStart, int rightEnd) {
        if(leftStart >= rightEnd)
            return;
        int mid = (leftStart + rightEnd)/2;
        mergeSort(array, temp, leftStart, mid);
        mergeSort(array, temp, mid+1, rightEnd);
        mergeHalves(array, temp, leftStart, rightEnd);
    }

    public static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;
        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while(left <= leftEnd && right <= rightEnd) {
            if(array[left] <= array[right]) {
                temp[index] = array[left];
                left++;
            } else {
                temp[index] = array[right];
                right++;
            }
            index++;
        }

        System.arraycopy(array, left, temp, index,leftEnd-left+1);
        System.arraycopy(array, right, temp, index,rightEnd-right+1);
        System.arraycopy(temp, leftStart, array, leftStart, size);
    }

}
