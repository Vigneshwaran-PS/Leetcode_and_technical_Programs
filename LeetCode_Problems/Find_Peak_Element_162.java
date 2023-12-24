package Leetcode_and_technical_Programs.LeetCode_Problems;



//Example 1:
//        Input: nums = [1,2,3,1]
//        Output: 2
//        Explanation: 3 is a peak element and your function should return the index number 2.
//Example 2:
//        Input: nums = [1,2,1,3,5,6,4]
//        Output: 5
//        Explanation: Your function can return either index number 1 where the peak element is 2,
//        or index number 5 where the peak element is 6.


public class Find_Peak_Element_162 {
    public static void main(String[] args) {
        System.out.println(peak(new int[]{1,2,3,1}));
        System.out.println(peak(new int[]{1,2,1,3,5,6,4}));
        System.out.println(peak(new int[]{1,2,1,3,5,6,7,8,9,4}));
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
