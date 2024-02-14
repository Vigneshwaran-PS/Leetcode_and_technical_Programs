package Leetcode_and_technical_Programs.Technical_Problems;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(palindrome("was it a car or a cat i saw"));
        System.out.println(palindrome("iam iron man"));
    }


    public static boolean palindrome(String str){
        String removeSpace = str.replaceAll("\s","");
        String temp = "";
        for(int i=removeSpace.length()-1;i>=0;i--){
            temp = temp + removeSpace.charAt(i);
        }
        return removeSpace.equals(temp);
    }
}
