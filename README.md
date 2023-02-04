<h2>Two Sum</h2>

A solution for the Two Sum problem on LeetCode using Java and Kotlin.

<h3>Problem</h3>

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

<h4>Example:</h4>

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

  <h3>Solution</h3>

<p>The solution uses a hash map to store each element and its index as key-value pairs. For each iteration, it calculates the complement of the current element to the target, which is `target - nums[i]`. If the complement exists in the hash map, the solution returns the indeces of the two elements that add up to the target. If not, the solution adds the current element and its index to the hash map.</p>
