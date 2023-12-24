package Leetcode_and_technical_Programs.LeetCode_Problems;

//Example 1:
//        Input: arr = [0,1,0]
//        Output: 1
//Example 2:
//        Input: arr = [0,2,1,0]
//        Output: 1
//Example 3:
//        Input: arr = [0,10,5,2]
//        Output: 1


public class Peak_Index_in_Mountain_Array_852 {
    public static void main(String[] args) {
        System.out.println(peak(new int[]{0,1,0}));
        System.out.println(peak(new int[]{0,2,1,0}));
        System.out.println(peak(new int[]{0,10,5,2}));
        System.out.println(peak(new int[]{10,9,8,4,5,6,4,3,2}));
        System.out.println(peak(new int[]{10,9,8}));
    }

    public static int peak(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
