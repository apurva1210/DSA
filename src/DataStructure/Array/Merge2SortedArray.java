package DataStructure.Array;

//
//Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
//
//        The number of elements initialized in nums1 and nums2 are m and n respectively.
//        You may assume that nums1 has a size equal to m + n such that it has enough space
//        to hold additional elements from nums2.

//
//Example 1:
//
//        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//        Output: [1,2,2,3,5,6]
//Example 2:
//
//        Input: nums1 = [1], m = 1, nums2 = [], n = 0
//        Output: [1]


import java.util.Arrays;

public class Merge2SortedArray {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};

        Merge2SortedArray merge2SortedArray = new Merge2SortedArray();
        merge2SortedArray.merge(nums1,3,  nums2, 3);

        System.out.println(Arrays.toString(nums1));
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] L = new int[m];

        for (int i = 0; i < m; i++) {
            L[i] = nums1[i];
        }

        int i = 0 , j= 0, k =0;
        while(i<m && j<n){
            if(L[i] <= nums2[j]){
                nums1[k++] = L[i++];
            }else {
                nums1[k++] = nums2[j++];
            }
        }

        while (i<m){
            nums1[k++] = L[i++];
        }

        while(j<n){
            nums1[k++] = nums2[j++];
        }

    }
}
