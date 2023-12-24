package Leetcode_and_technical_Programs.Technical_Problems;

public class BinarySearch1 {
    public static void main(String[] args) {
        int arr[] = {-65,-54,-23,0,5,27,78,79,91,101};
        System.out.println(binarySearch(arr,91)); // target is 91
        System.out.println(binarySearch(arr,0));  // target is 0
        System.out.println(binarySearch(arr,324));  // target is 324
        System.out.println(binarySearch(arr,23)); // target is 23
        System.out.println(binarySearch(arr,-65));  // target is -65
        System.out.println(binarySearch(arr,101));  // target is 101
        System.out.println(binarySearch(arr,5));    // target is 5
    }

    public static int binarySearch(int[] arr , int target){      // Returns the index of the target element if exists otherwise return -1
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
