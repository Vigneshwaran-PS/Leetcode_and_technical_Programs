package Leetcode_and_technical_Programs.LeetCode_Problems;

public class search_in_Infinite_SortedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{2,3,7,9,17,21,29,37,56,78,90,212,347,445} , 445));
        System.out.println(search(new int[]{2,3,7,9,17,21,29,37,56,78,90,212,347,445} , 3));
        System.out.println(search(new int[]{2,3,7,9,17,21,29,37,56,78,90,212,347,445} , 89));
    }

    public static int search(int[] arr , int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return searchInRange(arr , target ,start , end);
    }

    public static int searchInRange(int[] arr , int target , int start , int end){

        while(start <= end){
            int mid = start + (end - start)/2;
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
