package Leetcode_and_technical_Programs.LeetCode_Problems;

public class Pivot {
    public static void main(String[] args) {
        System.out.println(pivot(new int[]{4,5,6,7,0,1,2}));
        System.out.println(pivot(new int[]{1}));
        System.out.println(pivot(new int[]{2,3,4,5,6,9,0,1}));
    }

    public static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid;
            }

            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
