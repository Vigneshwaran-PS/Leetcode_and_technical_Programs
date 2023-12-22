package Leetcode_and_technical_Programs.Leetcode_Problems;

import java.util.ArrayList;

public class List_of_PrimeNumbers_From_1_to_1000 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<1000;i++){
            if(i==0 || i==1){
                continue;
            }
            if(prime(i)){
                list.add(i);
            }
        }
        System.out.println(list);
    }

    public static boolean prime(int num){
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
