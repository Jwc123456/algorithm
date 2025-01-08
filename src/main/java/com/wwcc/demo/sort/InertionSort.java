package com.wwcc.demo.sort;

import com.alibaba.fastjson.JSON;

/**
 * @author wwcc
 * @date 2025/01/08 20:18:46
 * @description 插入排序 可以想想打扑克牌的规律
 */
public class InertionSort {
    public static void main(String[] args) {
        int[] testArr = new int[]{1, 3, 2, 5, 4, 6, 7, 8, 9, 10, 0, 8, -5};
        sort(testArr);
        System.out.println(JSON.toJSONString(testArr));
    }

    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                continue;
            }
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = current;
        }
    }

}
