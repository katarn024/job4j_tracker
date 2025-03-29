package ru.job4j.pojo;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] fin = new int[2];
        for (int i = 0; i <= nums.length; i++) {
            for (int j = i + 1; j <= nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    fin = new int[]{i, j};
                }
            }
        }
        return fin;
    }
}