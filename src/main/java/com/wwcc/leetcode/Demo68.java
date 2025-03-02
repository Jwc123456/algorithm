package com.wwcc.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wwcc
 * @date 2025/02/22 19:55:05
 *
 * 给定一个单词数组 words 和一个长度 maxWidth ，重新排版单词，使其成为每行恰好有 maxWidth 个字符，且左右两端对齐的文本。
 *
 * 你应该使用 “贪心算法” 来放置给定的单词；也就是说，尽可能多地往每行中放置单词。必要时可用空格 ' ' 填充，使得每行恰好有 maxWidth 个字符。
 *
 * 要求尽可能均匀分配单词间的空格数量。如果某一行单词间的空格不能均匀分配，则左侧放置的空格数要多于右侧的空格数。
 *
 * 文本的最后一行应为左对齐，且单词之间不插入额外的空格。
 *
 * 注意:
 *
 * 单词是指由非空格字符组成的字符序列。
 * 每个单词的长度大于 0，小于等于 maxWidth。
 * 输入单词数组 words 至少包含一个单词。
 *
 *
 * 示例 1:
 *
 * 输入: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
 * 输出:
 * [
 *    "This    is    an",
 *    "example  of text",
 *    "justification.  "
 * ]
 * 示例 2:
 *
 * 输入:words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16
 * 输出:
 * [
 *   "What   must   be",
 *   "acknowledgment  ",
 *   "shall be        "
 * ]
 * 解释: 注意最后一行的格式应为 "shall be    " 而不是 "shall     be",
 *      因为最后一行应为左对齐，而不是左右两端对齐。
 *      第二行同样为左对齐，这是因为这行只包含一个单词。
 * 示例 3:
 *
 * 输入:words = ["Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"]，maxWidth = 20
 * 输出:
 * [
 *   "Science  is  what we",
 *   "understand      well",
 *   "enough to explain to",
 *   "a  computer.  Art is",
 *   "everything  else  we",
 *   "do                  "
 * ]
 *
 */
public class Demo68 {



    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> currList = new ArrayList();
        List<String> result = new ArrayList();


        for(int i = 0,currWidth = 0;i < words.length;i++){
            if(currWidth + words[i].trim().length() + currList.size()<=maxWidth){
                currWidth += words[i].trim().length();
                currList.add(words[i].trim());
            }else{
                result.add(fillSpace(currList,maxWidth,false));
                currWidth = words[i].trim().length();
                currList = new ArrayList<>();
                currList.add(words[i].trim());
            }
        }
        result.add(fillSpace(currList,maxWidth,true));
        return result;
    }


    public String fillSpace(List<String> curr,int maxWidth,Boolean isLast){
        int currWidth = 0;
        for(int i = 0;i < curr.size();i++){
            if(i != curr.size() - 1){
                curr.set(i ,curr.get(i) + " ");
            }
            currWidth += curr.get(i).length();
        }
        if(isLast || curr.size() == 1){
            int lastIndex = curr.size() - 1;
            int diff = maxWidth - currWidth;
            for(int i = 0;i < diff;i++){
                curr.set(lastIndex,curr.get(lastIndex) + " ");
            }
        }else{
            for(int i = 0;currWidth++ < maxWidth;i= (i + 1)%(curr.size() - 1)){
                curr.set(i ,curr.get(i) + " ");
            }
        }

        return String.join("",curr);
    }
}
