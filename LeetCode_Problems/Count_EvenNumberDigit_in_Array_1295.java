package Leetcode_and_technical_Programs.LeetCode_Problems;

import java.util.ArrayList;

public class Count_EvenNumberDigit_in_Array_1295 {
    public static void main(String ar[]){
        int arr[] ={23,4534,256,1345,39025,3245,1,764};

        // here 23,4534,1345,3245 are even digit because they have even number of digit
        System.out.println(findNumber(arr));
    }

    /* this method count the number of even digits available in array */
    public static int findNumber(int[] arr){
        int count = 0;
        for (int num : arr) {
            if(checkEven(num)){
                count++;
            }
        }
        return count;
    }


/* this method returns the number that are even digit*/
//    public static ArrayList<Integer> findNumber(int[] arr){
//        ArrayList<Integer> list = new ArrayList<>();
//        int count = 0;
//        for (int num : arr) {
//            if(checkEven(num)){
//                list.add(num);
//            }
//        }
//        return new ArrayList<>(list);
//    }

    public static boolean checkEven(int num){
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        return count%2==0;
    }
}
