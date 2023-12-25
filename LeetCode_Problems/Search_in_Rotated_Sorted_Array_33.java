package Leetcode_and_technical_Programs.LeetCode_Problems;


//Example 1:
//        Input: nums = [4,5,6,7,0,1,2], target = 0
//        Output: 4
//Example 2:
//        Input: nums = [4,5,6,7,0,1,2], target = 3
//        Output: -1
//Example 3:
//        Input: nums = [1], target = 0
//        Output: -1


public class Search_in_Rotated_Sorted_Array_33 {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4,5,6,7,0,1,2} , 0));
        System.out.println(search(new int[]{4,5,6,7,0,1,2} , 3));
        System.out.println(search(new int[]{1} , 0));
        System.out.println(search(new int[]{5,1,3} , 1));
    }

    public static int search(int[] arr , int target){
        int pivot = findPivot(arr);

        if(pivot == -1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }

        return binarySearch(arr,target,pivot+1,arr.length-1);
    }

    public static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid-1]){
                return mid;
            }

            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr , int target , int start , int end){

        while(start<=end){
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
