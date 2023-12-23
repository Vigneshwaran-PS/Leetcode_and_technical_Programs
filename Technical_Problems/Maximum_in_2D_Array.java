package Leetcode_and_technical_Programs.Technical_Problems;

import java.util.Arrays;

public class Maximum_in_2D_Array {
    public static void main(String[] args) { // returns position of minimum number
        int arr[][] = {     {13,56,78},
                {45,87,43,21},
                {324,56,32,7}   };
        System.out.println(Arrays.toString(maximum(arr)));
    }


    public static int[] maximum(int arr[][]){
        int max = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row,col};
    }
}
