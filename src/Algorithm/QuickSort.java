package Algorithm;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        QuickSort quickSort = new QuickSort();
        int[] nums = new int[]{2,9,6,8,1,2};
        quickSort.quicksort(nums, 0, nums.length-1);

        System.out.println("sorted array = " + Arrays.toString(nums));
    }

    void quicksort(int[] arr, int l, int h){
        if(l<h){
            int p = partition(arr, l, h);
            quicksort(arr, l, p-1);
            quicksort(arr, p+1, h);
        }
    }

    private int partition(int[] arr, int l, int h) {

        int pivot = arr[h];
        int i = l-1;

        for (int j = l; j < h ; j++) {
            if(arr[j] < pivot){
               swap(arr, ++i, j);
            }
        }

        swap(arr, ++i, h);

        return i;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
