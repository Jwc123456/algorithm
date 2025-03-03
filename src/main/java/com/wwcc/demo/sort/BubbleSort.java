package com.wwcc.demo.sort;

import com.alibaba.fastjson.JSON;

/**
 * @author wwcc
 * @date 2025/01/07 20:46:19
 * @description 冒泡排序 可以理解为不断的将最大的数冒上去
 */
public class BubbleSort {



    public static void main(String[] args) {
        int[] testArr = new int[]{1, 3, 2, 5, 4, 6, 7, 8, 9, 10, 0, 8, -5};
        sort(testArr);
        System.out.println(JSON.toJSONString(testArr));
    }

    public static void sort(int[] arr) {


        for (int i = 0;i < arr.length -1;i++){
            for(int j = 0; j < arr.length - 1 - i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
