package Leetcode_and_technical_Programs.Technical_Problems;


import java.util.Arrays;

public class Search_in_2D_Array {
    public static void main(String ar[]){   // Returns the index of the element if exists otherwise returns -1
        int arr[][] = {
                {1,2,3},
                {4,5,6,7,},
                {8,9}  };
        System.out.println(Arrays.toString(search(arr,6)));
    }


    public static int[] search(int[][] arr , int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(target == arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};
    }
}
