package Leetcode_and_technical_Programs.Technical_Problems;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicates_From_String {
    public static void main(String[] args) {
        String str = "java";
        char[] arr = str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();

        for(char c : arr){
            set.add(c);
        }
        System.out.println(set);

        StringBuffer sb = new StringBuffer();

        for(char c : set){
            sb.append(c);
        }

        System.out.println(sb);
    }
}
