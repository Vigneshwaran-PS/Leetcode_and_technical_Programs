package Leetcode_and_technical_Programs.Technical_Problems;


import java.util.Arrays;

// NOTE - Rowws and Columns itself sorted
public class BinarySearch_in_2D_Array {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(binarySearch(new int[][]{{10,12,14}, {15,18,24}, {29,34,45}} ,34)));
        System.out.println(Arrays.toString(binarySearch(new int[][]{{10,12,14}, {15,18,24}, {29,34,45}} ,90)));
        System.out.println(Arrays.toString(binarySearch(new int[][]{{10,12,14}, {15,18,24}, {29,34,45}} ,10)));
    }


    public static int[] binarySearch(int[][] arr , int target){
        int r = 0; // row
        int c = arr.length-1; // column

        while(r< arr.length && c>=0){
            if(arr[r][c] == target){
                return new int[]{r,c};
            }
            if(target > arr[r][c]){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
