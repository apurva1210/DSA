package DataStructure.Array;

//Given an array of integers arr, return true if and only if it is a valid mountain array.
//
//        Recall that arr is a mountain array if and only if:
//
//        arr.length >= 3
//        There exists some i with 0 < i < arr.length - 1 such that:
//        arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//        arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
//
//
//
//        Example 1:
//
//        Input: arr = [2,1]
//        Output: false
//        Example 2:
//
//        Input: arr = [3,5,5]
//        Output: false
//        Example 3:
//
//        Input: arr = [0,3,2,1]
//        Output: true
//
//
//        Constraints:
//
//        1 <= arr.length <= 104
//        0 <= arr[i] <= 104


public class ValidMountainArray {

    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{0,1,2,3,4,5,6,7,8,9}));
    }

    public static boolean validMountainArray(int[] arr) {

        if(arr.length < 3) return false;

        boolean foundPeak = false;
        int firstLowIndex = -1;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]) return false;
            if(arr[i] > arr[i-1]) foundPeak = true;
            else{
                if(!foundPeak) return false;
                firstLowIndex = i;
                break;
            }
        }

        if(firstLowIndex == -1) return false;

        for (int i = firstLowIndex+1; i < arr.length; i++) {
            if(arr[i] >= arr[i-1]) return false;
        }


        return true;
    }
}
