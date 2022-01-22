package com.jhunter.jstring.random;

import java.util.*;

public class GroupTheAnagrams49 {
    /*
        https://leetcode.com/problems/group-anagrams/
        Given an array of strings strs, group the anagrams together. You can return the answer in any order.
        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

        Example 1:
        Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length <= 0) {
            return new ArrayList<List<String>>();
        }
        Map<String, List<String>> resultMap = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] currentSortStr = str.toCharArray();
            Arrays.sort(currentSortStr);
            String sortedStr = new String(currentSortStr);
            if (resultMap.containsKey(sortedStr)) {
                resultMap.get(sortedStr).add(str);
            } else {
                List<String> stringList = new ArrayList<String>();
                stringList.add(str);
                resultMap.put(sortedStr, stringList);
            }
        }
        List<List<String>> resList = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : resultMap.entrySet()) {
            resList.add(entry.getValue());
        }
        return resList;
    }
}
