package javac;

import java.util.Arrays;

class SolutionTest {
    int[] arr1 = new int[]{2, 7, 11, 15};
    int[] arr2 = new int[]{3, 2, 4};
    int[] arr3 = new int[]{3, 3};

    @org.junit.jupiter.api.Test
    void twoSumSlow() {
        assert Arrays.equals(Solution.twoSumSlow(arr1, 9), new int[]{0, 1});
        assert Arrays.equals(Solution.twoSumSlow(arr2, 6), new int[]{1, 2});
        assert Arrays.equals(Solution.twoSumSlow(arr3, 6), new int[]{0, 1});
    }

    @org.junit.jupiter.api.Test
    void twoSumFast() {
        assert Arrays.equals(Solution.twoSumSlow(arr1, 9), new int[]{0, 1});
        assert Arrays.equals(Solution.twoSumSlow(arr2, 6), new int[]{1, 2});
        assert Arrays.equals(Solution.twoSumSlow(arr3, 6), new int[]{0, 1});
    }
}