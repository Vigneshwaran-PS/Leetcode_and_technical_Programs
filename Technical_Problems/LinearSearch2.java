package Leetcode_and_technical_Programs.Technical_Problems;


/* return true if the elemet exists
   otherwise returns false */

public class LinearSearch2 {
    public static void main(String[] args) {
        int[] arr = {23,45,57,3,435,21,345,8,23,12};
        System.out.println(linearSearch(arr,2));
        System.out.println(linearSearch(arr,23));
        System.out.println(linearSearch(arr,52));
        System.out.println(linearSearch(arr,57));
        System.out.println(linearSearch(arr,12));
    }

    public static boolean linearSearch(int[] arr, int target){

        if (arr.length == 0) {
            return false;
        }
        for(int num : arr){
            if(num == target){
                return true;
            }
        }
        return false;
    }
}
