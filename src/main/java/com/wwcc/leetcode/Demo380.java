package com.wwcc.leetcode;

import java.util.*;

/**
 * @author wwcc
 * @date 2025/02/10 19:33:58
 */
public class Demo380 {

    List<Integer> nums;
    Map<Integer,Integer> indices;
    Random random;

    public Demo380() {
        nums = new ArrayList<Integer>();
        indices = new HashMap<Integer, Integer>();
        random = new Random();

    }

    public boolean insert(int val) {
        if(indices.containsKey(val)){
            return false;
        }
        int index = nums.size();
        nums.add(val);
        indices.put(val,index);
        return true;
    }

    public boolean remove(int val) {
        if(!indices.containsKey(val)){
            return false;
        }
        int index = indices.get(val);
        int last = nums.get(nums.size() -1);
        nums.set(index,last);
        indices.put(last,index);
        nums.remove(nums.size() - 1);
        indices.remove(val);
        return true;
    }

    public int getRandom() {
        int index = random.nextInt(nums.size());
        return nums.get(index);

    }
}
