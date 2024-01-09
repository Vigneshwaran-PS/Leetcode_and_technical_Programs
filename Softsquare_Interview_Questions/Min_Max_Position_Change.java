package Leetcode_and_technical_Programs.Softsquare_Interview_Questions;

import java.util.Arrays;

public class Min_Max_Position_Change {
    public static void main(String[] args) {
        change(new int[]{346,5,2,6,7,89,-90,6});
    }

    public static void change(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxPos = 0;
        int minPos = 0;

        for(int i=0;i< arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
                maxPos = i;
            }
        }
        for(int i=0;i< arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
                minPos = i;
            }
        }

        arr[maxPos] = min;
        arr[minPos] = max;
        System.out.println(Arrays.toString(arr));
    }
}
