package Leetcode_and_technical_Programs.LeetCode_Problems;


// Largest element in the array but that is smaller than or equal to target element
// return the index of the target
public class FloorNumber {
    public static void main(String[] args) {
        System.out.println(floor(new int[]{2,6,7,10,15,19,23,45,68,98} , 45));
        System.out.println(floor(new int[]{2,6,7,10,15,19,23,45,68,98} , 7));
        System.out.println(floor(new int[]{2,6,7,10,15,19,23,45,68,98} , 19));
        System.out.println(floor(new int[]{2,6,7,10,15,19,23,45,68,98} , 14));
        System.out.println(floor(new int[]{2,6,7,10,15,19,23,45,68,98} , 55));
        System.out.println(floor(new int[]{2,6,7,10,15,19,23,45,68,98} , 1));
    }

    public static int floor(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(target == arr[mid]){
                return mid;
            }
            if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return end;
    }
}
