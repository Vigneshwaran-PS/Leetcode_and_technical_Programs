package Leetcode_and_technical_Programs.Technical_Problems;

public class LinearSearchRange {
    public static void main(String[] args) {
        int arr[] = {34,56,3,6,63,454,23,12};
        System.out.println(search(arr,3,0,5));
        System.out.println(search(arr,100,0,5));
    }

    public static String search(int[] arr, int target , int start , int end){
        int i;
        for (i = start; i < end; i++) {
            if(target == arr[i]){
                return target+" Exists in index "+i;
            }
        }
        return target+" doesn't exists in the specified range";
    }
}
