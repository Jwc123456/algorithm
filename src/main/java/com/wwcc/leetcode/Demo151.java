package com.wwcc.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author wwcc
 * @date 2025/02/22 19:43:32
 */
public class Demo151 {


    public static void main(String[] args) {
        String s = reverseWords("a good   example");
        System.out.println(s);
    }
    public static String reverseWords(String s) {
        if(null == s){
            return s;
        }
        String[] strArr = s.trim().split(" ");
        if(strArr.length == 0){
            return s;
        }
        StringBuffer str = new StringBuffer();
        for(int i = strArr.length -1;i >= 0;i--){
            if("".equals(strArr[i])){
                continue;
            }
            str.append(strArr[i].trim());
            if(i != 0){
                str.append(" ");
            }
        }
        return str.toString();
    }


    public String reverseWordsExample(String s) {
        // 除去开头和末尾的空白字符
        s = s.trim();
        // 正则匹配连续的空白字符作为分隔符分割
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }

}
