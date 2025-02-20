package com.wwcc.leetcode;

/**
 * @author wwcc
 * @date 2025/02/20 19:14:23
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 *
 *
 * 示例 1：
 *
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 *
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *
 *
 * 提示：
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 如果非空，则仅由小写英文字母组成
 */
public class Demo14 {


    public String longestCommonPrefix(String[] strs) {
        if(null == strs || strs.length == 0){
            return "";
        }

        int length =  strs[0].length();
        for(int i = 0;i < length;i++){
            char temp = strs[0].charAt(i);
            for(int j = 0;j < strs.length;j ++){
                if(i == strs[j].length() ||strs[j].charAt(i) != temp){
                    return strs[0].substring(0,i);
                }
            }
        }

        return strs[0];
    }
}
