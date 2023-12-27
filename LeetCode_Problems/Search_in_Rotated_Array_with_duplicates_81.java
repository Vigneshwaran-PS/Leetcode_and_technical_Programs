package Leetcode_and_technical_Programs.LeetCode_Problems;


//Example 1:
//        Input: nums = [2,5,6,0,0,1,2], target = 0
//        Output: true
//Example 2:
//        Input: nums = [2,5,6,0,0,1,2], target = 3
//        Output: false


public class Search_in_Rotated_Array_with_duplicates_81 {
    public static void main(String[] args) {
        System.out.println(search(new int[]{2,5,6,0,0,1,2} , 0));
        System.out.println(search(new int[]{2,5,6,0,0,1,2} , 3));
    }

    public static boolean search(int[] arr , int target){
        int pivot = pivotIndex(arr);
        if(pivot == -1){
            return binarySearch(arr,target,0,arr.length-1);
        }

        if (target == arr[pivot]){
            return true;
        }
        if(target >= arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,pivot+1,arr.length-1);
    }

    public static int pivotIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid  = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
               return mid - 1;
            }

            if(arr[mid] == start && arr[mid] == arr[end]){
                if(start < end && arr[start] > arr[start+1]) {
                    return start;
                }
                start++;
                if(end > start && arr[end] < arr[end-1]){
                    return end - 1;
                }
                end--;
            }else if(arr[mid] < arr[start] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static boolean binarySearch(int[] arr , int target , int start , int end){
        while(start<=end){
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return true;
            }
        }
        return false;
    }
}
