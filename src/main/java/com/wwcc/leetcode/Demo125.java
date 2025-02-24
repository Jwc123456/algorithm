package com.wwcc.leetcode;

/**
 * @author wwcc
 * @date 2025/02/24 12:38:21
 */
public class Demo125 {

    public boolean isPalindrome(String s) {
        StringBuffer str = new StringBuffer();
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                str.append(Character.toLowerCase(ch));
            }
        }

        return new StringBuffer(str).reverse().toString().equals(str.toString());
    }
}
