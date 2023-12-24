package Leetcode_and_technical_Programs.Technical_Problems;


/* here we don't know whether the given array is sorted in ascending or
    descending order , so we need to find it first , then need to find the target element */

public class Order_agnostic_BinarySearch {
    public static void main(String[] args) {
        //ascending order array
        System.out.println(binarySearch(new int[]{-65,-54,-23,0,5,27,78,79,91,101} , 91));
        System.out.println(binarySearch(new int[]{-65,-54,-23,0,5,27,78,79,91,101} , 0));
        System.out.println(binarySearch(new int[]{-65,-54,-23,0,5,27,78,79,91,101} , -65));
        System.out.println(binarySearch(new int[]{-65,-54,-23,0,5,27,78,79,91,101} , 89));

        //descending order array
        System.out.println(binarySearch(new int[]{98,76,43,12,9,0,-32,-65,-78,-90} , 91));
        System.out.println(binarySearch(new int[]{98,76,43,12,9,0,-32,-65,-78,-90} , -90));
        System.out.println(binarySearch(new int[]{98,76,43,12,9,0,-32,-65,-78,-90} , 98));
        System.out.println(binarySearch(new int[]{98,76,43,12,9,0,-32,-65,-78,-90} , 0));
    }

    public static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;

        if(arr[start] < arr[end]){          // ascending order
            while(start <= end){
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
        }else{          // deescending order
            while(start <= end){
                int mid = start + (end-start)/2;

                if(target == arr[mid]){
                    return mid;
                }
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
