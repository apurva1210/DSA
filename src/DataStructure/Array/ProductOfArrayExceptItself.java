package DataStructure.Array;

//Given an array nums of n integers where n > 1,
// return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
//
//        Example:
//
//        Input:  [1,2,3,4]
//        Output: [24,12,8,6]
//        Constraint: It's guaranteed that the product of the elements
//        of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.
//
//        Note: Please solve it without division and in O(n).
//
//        Follow up:
//        Could you solve it with constant space complexity? (The output array
//        does not count as extra space for the purpose of space complexity analysis.)

import java.util.Arrays;

public class ProductOfArrayExceptItself {

    public static void main(String[] args) {

        ProductOfArrayExceptItself productOfArrayExceptItself = new ProductOfArrayExceptItself();
        int[] nums = new int[]{1,2,3,4};
        //int[] ans1 = productOfArrayExceptItself.productExceptSelf1(nums);
        int[] ans2 = productOfArrayExceptItself.productExceptSelf2(nums);

       // System.out.println("ans = " + Arrays.toString(ans1));
        System.out.println("ans = " + Arrays.toString(ans2));
    }

    public int[] productExceptSelf1(int[] nums) {

        int l = nums.length;
        int[] L = new int[l];
        int[] R = new int[l];

        L[0] = 1;
        for (int i = 1; i < l; i++) {
            L[i] = L[i-1] * nums[i-1];
        }

        R[l-1] = 1;
        for (int i = l-2; i >= 0; i--) {
            R[i] = R[i+1] * nums[i+1];
        }

        for (int i = 0; i < l; i++) {
            nums[i] = L[i] * R[i];
        }

        return nums;

    }


    private int[] productExceptSelf2(int[] nums) {

        int l = nums.length;

        int[] ans = new int[l];

        ans[0] = 1;

        for (int i = 1; i < l; i++) {
            ans[i] = ans[i-1] * nums[i-1];
        }

        int r = 1;

        for (int i = l-1; i >= 0; i--) {
            ans[i] = ans[i] * r;
            r *= nums[i];
        }

        return ans;
     }


}

