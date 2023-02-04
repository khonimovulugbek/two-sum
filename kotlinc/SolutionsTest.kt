package kotlinc

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionsTest {
    private val arr1 = intArrayOf(2, 7, 11, 15)
    private val arr2 = intArrayOf(3, 2, 4)
    private val arr3 = intArrayOf(3, 3)

    @Test
    fun twoSumSlow() {
        assertArrayEquals(Solutions.twoSumSlow(arr1, 9), intArrayOf(0, 1))
        assertArrayEquals(Solutions.twoSumSlow(arr2, 6), intArrayOf(1, 2))
        assertArrayEquals(Solutions.twoSumSlow(arr3, 6), intArrayOf(0, 1))
    }

    @Test
    fun twoSumFast() {
        assertArrayEquals(Solutions.twoSumFast(arr1, 9), intArrayOf(0, 1))
        assertArrayEquals(Solutions.twoSumFast(arr2, 6), intArrayOf(1, 2))
        assertArrayEquals(Solutions.twoSumFast(arr3, 6), intArrayOf(0, 1))
    }
}