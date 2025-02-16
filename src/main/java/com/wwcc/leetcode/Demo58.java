package com.wwcc.leetcode;

/**
 * @author wwcc
 * @date 2025/02/16 18:41:30
 *
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
 *
 * 单词 是指仅由字母组成、不包含任何空格字符的最大
 * 子字符串
 * 。
 *
 *
 *
 * 示例 1：
 *
 * 输入：s = "Hello World"
 * 输出：5
 * 解释：最后一个单词是“World”，长度为 5。
 * 示例 2：
 *
 * 输入：s = "   fly me   to   the moon  "
 * 输出：4
 * 解释：最后一个单词是“moon”，长度为 4。
 * 示例 3：
 *
 * 输入：s = "luffy is still joyboy"
 * 输出：6
 * 解释：最后一个单词是长度为 6 的“joyboy”。
 *
 *
 * 提示：
 *
 * 1 <= s.length <= 104
 * s 仅有英文字母和空格 ' ' 组成
 * s 中至少存在一个单词
 */
public class Demo58 {


    public int lengthOfLastWord(String s) {
        int n =  s.length();
        if(n <= 1){
            return n;
        }
        int result = 0;
        for(int i = n-1;i >= 0;i--){
            boolean isEmpty = " ".equals(String.valueOf(s.charAt(i)));
            if(isEmpty && result != 0){
                return result;
            }
            if(!isEmpty){
                result ++;
            }

        }


        return result;
    }

}
