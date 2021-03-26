package DataStructure.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOf2Arrays {

//    Given two arrays, write a function to compute their intersection. If elements are duplicate return unique
//
//            Example 1:
//
//    Input: nums1 = [1,2,2,1], nums2 = [2,2]
//    Output: [2]
//    Example 2:
//
//    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//    Output: [9,4]
//



    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> numSet1 = new HashSet<>();
        Set<Integer> numSet2 = new HashSet<>();

        for (int i : nums1) {
            numSet1.add(i);
        }

        for (int i : nums2) {
            numSet2.add(i);
        }

        if(numSet1.size() < numSet2.size()) return intersection(numSet1, numSet2);
        else return intersection(numSet2, numSet1);

    }

    public int[] intersection(Set<Integer> numSet1, Set<Integer> numSet2){

        int[] output = new int[numSet1.size()];
        int index = 0;

        for (Integer i : numSet1) {
            if(numSet2.contains(i)) output[index++] = i;
        }

        return Arrays.copyOf(output, index);
    }
}
