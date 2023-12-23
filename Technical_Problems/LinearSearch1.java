package Leetcode_and_technical_Programs.Technical_Problems;


public class LinearSearch1 {
    public static void main(String[] args) {
        int arr[] = {23,5,7,3,7,453,67,3,56};
        System.out.println(linearSearch(arr,3));
        System.out.println(linearSearch(arr,45));
        System.out.println(linearSearch(arr,67));
        System.out.println(linearSearch(arr,56));
    }

    public static int linearSearch(int[] arr , int target){
        if(arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
