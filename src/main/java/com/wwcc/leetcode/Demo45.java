package com.wwcc.leetcode;

/**
 * @author wwcc
 * @date 2025/02/07 18:25:46
 */
public class Demo45 {


    public static void main(String[] args) {
        int[] testArr = {2, 3, 1, 1, 4};
        jump(testArr);
    }

    public static int jump(int[] nums) {
        int n = nums.length;
        int position = n-1;
        int steps = 0;
        while(position > 0){
            for(int i=0;i < position;i++){
                if(i+nums[i] >= position){
                    position =i;
                    steps ++;
                    break;
                }
            }
        }
        return steps;
    }
}
