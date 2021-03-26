package DataStructure.Array;

//Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
//
//        Example 1:
//
//        Input: [3,2,1,5,6,4] and k = 2
//        Output: 5
//        Example 2:
//
//        Input: [3,2,3,1,2,4,5,5,6] and k = 4
//        Output: 4
//        Note:
//        You may assume k is always valid, 1 ≤ k ≤ array's length.

import Algorithm.QuickSelect;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement {

    public static void main(String[] args) {

        KthLargestElement kthLargestElement = new KthLargestElement();
        int[] nums= new int[]{3,2,1,5,6,4};
        int k = 2;
        //int l = kthLargestElement.findKthLargest1(nums, k);
        //int l = kthLargestElement.findKthLargest2(nums, k);
        int l = kthLargestElement.findKthLargest3(nums, k);

        System.out.println("l = " + l);
    }


    public int findKthLargest1(int[] nums, int k) {
        Arrays.sort(nums);

        for (int i = nums.length -1, j = 1; i >=0 ; i--, j++) {
            if(j == k) return nums[i];
        }

        throw new IllegalArgumentException("invalid input");
    }

    //heap
    public int findKthLargest2(int[] nums, int k) {

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int n: nums) {
            heap.add(n);
            if(heap.size() > k)
                heap.poll();
        }

        return heap.poll();
    }

    //quickSelect
    private int findKthLargest3(int[] nums, int k) {
        int l = nums.length;
        //kth largest element is l-k+1 smallest element.
        QuickSelect quickSelect = new QuickSelect();
        return quickSelect.quickselect(nums, 0, l-1, l-k+1);
    }


}
