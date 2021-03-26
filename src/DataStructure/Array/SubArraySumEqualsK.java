package DataStructure.Array;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {

    public static void main(String[] args) {

        SubArraySumEqualsK subArraySumEqualsK = new SubArraySumEqualsK();
        int[] nums = new int[]{1,1,1};
        System.out.println(subArraySumEqualsK.subarraySum(nums, 2));
    }

    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;

        map.put(0, 1);

        for (int n: nums) {
            sum += n;
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }

        return count;
    }
}

