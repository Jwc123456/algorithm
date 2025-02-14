package com.wwcc.leetcode;

/**
 * @author wwcc
 * @date 2025/02/14 19:17:08
 *
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 *
 *
 *
 * 示例 1：
 *
 *
 *
 * 输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * 输出：6
 * 解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
 */
public class Demo42 {

    public int trap(int[] height) {
        int n = height.length;
        if(n == 0){
            return n;
        }


        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for(int i = 1;i < n;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2;i >=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }

        int result = 0;
        for(int i = 0;i < n;i++){
            result += (Math.min(leftMax[i],rightMax[i]) - height[i]);
        }

        return result;



    }
}
