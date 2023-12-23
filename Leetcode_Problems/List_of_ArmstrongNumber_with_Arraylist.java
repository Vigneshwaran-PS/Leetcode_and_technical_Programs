package Leetcode_and_technical_Programs.Leetcode_Problems;

import java.util.ArrayList;

public class List_of_ArmstrongNumber_with_Arraylist {
    public static void main(String[] args) {
        System.out.println(armstrong(new int[]{213,5,1,54,370,132,153,78,43,14,371,72,9,8,7}));
    }

    public static ArrayList<Integer> armstrong(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr){
            if(num==2 || num==3 || num==4 || num==5 || num==6 || num==7 || num==8 || num==9){
                list.add(num);
            }
            if(checkArmstrong(num)){
                list.add(num);
            }
        }
        return new ArrayList<>(list);
    }

    public static boolean checkArmstrong(int num){
        int temp = num;
        int cubeSum = 0;
        while(num > 0){
            int rem = num % 10;
            cubeSum = cubeSum + (int)Math.pow(rem,3);
            num/=10;
        }
        return temp==cubeSum;

    }
}
