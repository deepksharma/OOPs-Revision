package leetcode;

import java.util.HashSet;
import java.util.Set;


class LengthOfLongestSubstring{
    public static int logestUniqueSubstring(String s){

        Set<Character> set = new HashSet<>();

        int left =0;
        int maxLen = 0;
        for(int right = 0 ; right<s.length(); right++){
            char ch = s.charAt(right);

            while (set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxLen = Math.max(maxLen , right-left+1);
        }
        return maxLen;
    }
}

public class LeetCode3 {
    public static void main(String[] args) {
        LengthOfLongestSubstring lls = new LengthOfLongestSubstring();
        int result = lls.logestUniqueSubstring("abcabcbb");
        System.out.println(result);
    }
}
