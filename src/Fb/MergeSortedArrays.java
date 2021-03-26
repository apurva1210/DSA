package Fb;

public class MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int L[] = new int[m];

        for(int i = 0; i < m; i++){
            L[i] = nums1[i];
        }

        int i = 0 , j = 0, k = 0;
        while(i < m && j < n){
            if(L[i] < nums2[j]){
                nums1[k++] = L[i++];
            }else{
                nums1[k++] = nums2[j++];
            }
        }

        while(i < m){
            nums1[k++] = L[i++];
        }

        while(j < n){
            nums1[k++] = nums2[j++];
        }
    }
}
