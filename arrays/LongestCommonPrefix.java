// Problem: Longest Common Prefix (LeetCode #14)
// Time Complexity: O(n * m)
// Space Complexity: O(1)
// Description: Find the longest prefix common to all strings in the array.

class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0) return "";

        String result = "";

        for(int i = 0; i < strs[0].length(); i++){
            char ch = strs[0].charAt(i);

            for(int j = 1; j < strs.length; j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != ch){
                    return result;
                }
            }

            result += ch;
        }

        return result;
    }
}
