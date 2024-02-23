package Leetcode_and_technical_Programs.Technical_Problems;

public class SecondLargest_Element_in_Array {
    public static void main(String[] args) {
        System.out.println(secondLargestElement(new int[]{1,2,3,4,5,6,7,8,9}));
        System.out.println(secondLargestElement(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1}));
        System.out.println(secondLargestElement(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 8, 9}));
        System.out.println(secondLargestElement(new int[]{-9, -8, -7, -6, -5, -4, -3, -2, -1}));
        System.out.println(secondLargestElement(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1}));
        System.out.println(secondLargestElement(new int[]{5}));
        System.out.println(secondLargestElement(new int[]{}));
        System.out.println(secondLargestElement(new int[]{5, 2}));
        System.out.println(secondLargestElement(new int[]{5, 2, 8}));
        System.out.println(secondLargestElement(new int[]{1000000, 2000000, 3000000, 4000000, 5000000}));
    }

    public static int secondLargestElement(int[] arr){

        int firstLargest = Integer.MIN_VALUE , secondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != firstLargest){
                secondLargest = arr[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }
        return  secondLargest;
    }
}
