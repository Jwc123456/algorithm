package com.wwcc.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wwcc
 * @date 2025/02/27 18:46:03
 */
public class Demo438 {

    public static void main(String[] args) {
        findAnagrams("cbaebabacd", "abc");
    }

    public static List<Integer> findAnagrams(String s, String p) {
        int sLen = s.length(), pLen = p.length();

        // 处理特殊情况：如果 s 的长度小于 p 的长度，直接返回空列表
        if (sLen < pLen) {
            return new ArrayList<Integer>();
        }

        List<Integer> ans = new ArrayList<Integer>(); // 结果列表，存储所有符合条件的起始索引
        int[] sCount = new int[26]; // 统计 s 中当前窗口的字符频率（对应26个英文字母）
        int[] pCount = new int[26]; // 统计 p 的字符频率

        // 初始化：统计 p 和 s 的初始窗口（前 pLen 个字符）的字符频率
        for (int i = 0; i < pLen; ++i) {
            ++sCount[s.charAt(i) - 'a']; // 更新 s 的初始窗口字符频率
            ++pCount[p.charAt(i) - 'a']; // 更新 p 的字符频率
        }

        // 检查初始窗口是否为异位词
        if (Arrays.equals(sCount, pCount)) {
            ans.add(0); // 如果相等，则将起始索引0添加到结果列表
        }

        // 滑动窗口，从左到右移动窗口
        for (int i = 0; i < sLen - pLen; ++i) {
            // 左移窗口，移除最左边的字符，并更新 sCount
            --sCount[s.charAt(i) - 'a'];
            // 添加新字符到窗口的右侧，并更新 sCount
            ++sCount[s.charAt(i + pLen) - 'a'];

            // 检查当前窗口的字符频率是否与 p 的相等
            if (Arrays.equals(sCount, pCount)) {
                ans.add(i + 1); // 如果相等，则将当前起始索引添加到结果列表
            }
        }

        return ans; // 返回结果列表
    }
}
