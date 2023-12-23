package Leetcode_and_technical_Programs.Leetcode_Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class Reversing_the_Array {
    public static void main(String[] args) {
        int arr[] = {23,4,12,45,678,75,23,67,7,3};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    public static int[] reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}
