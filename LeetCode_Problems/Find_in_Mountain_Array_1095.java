package Leetcode_and_technical_Programs.LeetCode_Problems;


//Example 1:
//        Input: array = [1,2,3,4,5,3,1], target = 3
//        Output: 2
//        Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
//Example 2:
//        Input: array = [0,1,2,4,2,1], target = 3
//        Output: -1
//        Explanation: 3 does not exist in the array, so we return -1.

public class Find_in_Mountain_Array_1095 {
    public static void main(String[] args) {
        System.out.println(mountainSearch(new int[]{1,2,3,4,5,3,1} , 3));
        System.out.println(mountainSearch(new int[]{0,1,2,4,2,1} , 3));
        System.out.println(mountainSearch(new int[]{0,1,2,3,4,5,6,7,8,2,1} , 6));
        System.out.println(mountainSearch(new int[]{0,1,2,3,4,5,6,7,8,2,1} , 2));
    }

    public static int mountainSearch(int[] arr , int target){
        int peak = peakIndex(arr);
        int target_index = targetIndex(arr , target , 0 , peak);
        if(target_index != -1){
            return target_index;
        }
        return targetIndex(arr , target , peak+1 , arr.length-1);
    }

    public static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    public static int targetIndex(int[] arr , int target , int start , int end){

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
