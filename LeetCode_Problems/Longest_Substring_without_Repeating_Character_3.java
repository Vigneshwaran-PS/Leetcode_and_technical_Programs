package Leetcode_and_technical_Programs.LeetCode_Problems;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_without_Repeating_Character_3 {

    public static void main(String[] args) {
        System.out.println(longestChain("abcabcbb"));
    }

    public static int longestChain(String s){
        int maxLength = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int currentIndex = sb.indexOf(String.valueOf(s.charAt(i)));
            if (currentIndex != -1) {
                sb.delete(0, currentIndex + 1);
            }
            sb.append(s.charAt(i));
            maxLength = Math.max(maxLength, sb.length());
        }
        return maxLength;
    }
}
