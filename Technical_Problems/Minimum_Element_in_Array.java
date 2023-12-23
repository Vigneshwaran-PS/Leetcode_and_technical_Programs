package Leetcode_and_technical_Programs.Technical_Problems;

public class Minimum_Element_in_Array {
    public static void main(String[] args) {
        int arr[] ={34,45,21,6658,32,57,32,561,1,54,7,6};
        System.out.println("Minimum element in an array : "+min(arr));
        int start = 2;
        int end = 7;
        System.out.println("Minimum element from the range "+start+"to "+end+"is : "+minRange(arr,start,end));
    }

    public static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int num : arr){
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    public static int minRange(int[] arr,int start, int end){
        int min = Integer.MAX_VALUE;
        for(int i = start ; i < end ;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
