package javac;

import java.util.HashMap;
import java.util.Map;

/**
 * Author : Khonimov Ulugbek
 * Date : 2/4/2023
 */
public class Solution {
    public static int[] twoSumSlow(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSumFast(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int c = target - nums[i];
            if (map.containsKey(c)) {
                return new int[]{map.get(c), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
