package Leetcode_and_technical_Programs.Leetcode_Problems;

import java.util.Arrays;

public class Maximum_Element_in_array {
    public static void main(String[] args) {
        int[] arr = {23,547,5,21,7,89,34,56,645,233};
        System.out.println("Maximum Element in the array : " + max(arr));
        int i = 3;
        int j = 7;
        System.out.println("Maximum element from the range "+i+"to "+j+"is : "+ maxRange(arr,i,j));
    }

    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int num :arr){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

    public static int maxRange(int[] arr , int start , int end){
        int max = Integer.MIN_VALUE;
        if(end > start){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
