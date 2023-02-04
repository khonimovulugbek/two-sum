package kotlinc

class Solutions {
    companion object {
        @JvmStatic
        fun twoSumSlow(nums: IntArray, target: Int): IntArray {
            for (i in 0 until (nums.size - 1)) {
                for (j in (i + 1) until nums.size) {
                    if (nums[i] + nums[j] == target) {
                        return intArrayOf(i, j)
                    }
                }
            }
            return intArrayOf(-1, -1)
        }

        @JvmStatic
        fun twoSumFast(nums: IntArray, target: Int): IntArray {
            val map = mutableMapOf<Int, Int>()
            for (i in nums.indices) {
                val c = target - nums[i]
                if (map.containsKey(c))
                    return intArrayOf(map[c]!!, i)
                map[nums[i]] = i
            }

            return intArrayOf(-1, -1)
        }
    }
}