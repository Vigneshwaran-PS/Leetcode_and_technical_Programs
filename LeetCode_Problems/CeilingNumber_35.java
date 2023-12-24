package Leetcode_and_technical_Programs.LeetCode_Problems;


// Smallest element in array but greater than or equal to the target value
// returns the index of the ceiling element

// Example 1:
//        Input: nums = [1,3,5,6], target = 5
//        Output: 2
// Example 2:
//        Input: nums = [1,3,5,6], target = 2
//        Output: 1
// Example 3:
//        Input: nums = [1,3,5,6], target = 7
//        Output: 4
public class CeilingNumber_35 {
    public static void main(String[] args) {
        System.out.println(ceiling(new int[]{2,6,7,10,15,19,23,45,68,98} , 45));
        System.out.println(ceiling(new int[]{2,6,7,10,15,19,23,45,68,98} , 7));
        System.out.println(ceiling(new int[]{2,6,7,10,15,19,23,45,68,98} , 19));
        System.out.println(ceiling(new int[]{2,6,7,10,15,19,23,45,68,98} , 14));
        System.out.println(ceiling(new int[]{2,6,7,10,15,19,23,45,68,98} , 55));
        System.out.println(ceiling(new int[]{2,6,7,10,15,19,23,45,68,98} , 1));
    }

    public static int ceiling(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end -start) / 2;

            if(target == arr[mid]){
                return mid;
            }
            if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return start;
    }
}
