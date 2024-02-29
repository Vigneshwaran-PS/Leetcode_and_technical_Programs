package Leetcode_and_technical_Programs.LeetCode_Problems;


//Example 1:
//
//Input: s = "anagram", t = "nagaram"
//Output: true
//Example 2:
//
//Input: s = "rat", t = "car"
//Output: false

import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram_242 {

    public static void main(String[] args) {
        System.out.println(find("anagram" , "nagaram"));
        System.out.println(find("rat" , "car"));
        System.out.println(find("mom" , "mom"));
        System.out.println(find("aabbc" , "cbbaa"));
        System.out.println(find("ddbbccc" , "ccbbdd"));
    }

    public static boolean find(String a , String b){

        if(a.length() != b.length()){
            return false;
        }

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<a.length();i++){
            int count = 0;
            if(map.containsKey(a.charAt(i))){
                count = map.get(a.charAt(i));
                map.put(a.charAt(i),count+1);
            }else{
                map.put(a.charAt(i),1);
            }
        }

        for(int i=0;i<b.length();i++){
            int count = 0;
            if(map.containsKey(b.charAt(i))){
                count = map.get(b.charAt(i));
                if(count == 0){
                    return false;
                }
                map.put(b.charAt(i),count-1);
            }else{
                return false;
            }
        }
        return true;
    }
}
