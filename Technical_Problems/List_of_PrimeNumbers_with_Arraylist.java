package Leetcode_and_technical_Programs.Leetcode_Problems;

import java.util.ArrayList;

public class List_of_PrimeNumbers_with_Arraylist {
    public static void main(String[] args) {
        System.out.println(prime(new int[]{23,1,89,79,69,33,2,0,31,71,43,99,15,30}));
    }

    public static ArrayList<Integer> prime(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();

        for(int num : arr){
            if(num==0 || num==1){
                continue;
            }
            if(checkPrime(num)){
                list.add(num);
            }
        }
        return new ArrayList<>(list);
    }

    public static boolean checkPrime(int num){
        int i = 2;
        int count = 0;
        while(num > i){
            if(num % i == 0){
                count++;
                break;
            }
            i++;
        }
        return count==0;
    }
}
