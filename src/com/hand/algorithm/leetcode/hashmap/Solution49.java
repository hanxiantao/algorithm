package com.hand.algorithm.leetcode.hashmap;

import java.util.*;

/**
 * 49. 字母异位词分组
 */
public class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String tmp = String.valueOf(charArray);
            if (map.containsKey(tmp)) {
                map.get(tmp).add(str);
            } else {
                List<String> tmpList = new ArrayList<>();
                tmpList.add(str);
                map.put(tmp, tmpList);
            }
        }
        return new ArrayList<>(map.values());
    }
}
