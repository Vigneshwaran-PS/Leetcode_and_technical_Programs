package Leetcode_and_technical_Programs.Technical_Problems;

import java.util.Scanner;

// Swap two numbers without using any extra variables(temp variable)
public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        function(a,b);
    }
    public static void function(int a , int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }

    // Alternative method
//    public static void function(int a , int b){
//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
//        System.out.println("a : "+a);
//        System.out.println("b : "+b);
//    }
}
