package com.wwcc.leetcode;

/**
 * @author wwcc
 * @date 2025/02/11 20:25:04
 *
 * 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积 。
 *
 * 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。
 *
 * 请 不要使用除法，且在 O(n) 时间复杂度内完成此题。
 *
 *
 *
 * 示例 1:
 *
 * 输入: nums = [1,2,3,4]
 * 输出: [24,12,8,6]
 * 示例 2:
 *
 * 输入: nums = [-1,1,0,-3,3]
 * 输出: [0,0,9,0,0]
 */
public class Demo238 {


    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];


        left[0] = 1;
        for(int i = 1;i<nums.length;i++){
            left[i] = nums[i -1] * left[i -1];
        }

        right[nums.length -1] = 1;
        for(int i = nums.length - 2;i >= 0;i--){
            right[i] = nums[i +1] * right[i+1];
        }

        for(int i = 0;i<result.length;i++){
            result[i] = left[i ] * right[i];
        }
        return result;

    }
}
