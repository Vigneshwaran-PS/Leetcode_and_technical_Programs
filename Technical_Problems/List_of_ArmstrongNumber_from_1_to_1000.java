package Leetcode_and_technical_Programs.Leetcode_Problems;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class List_of_ArmstrongNumber_from_1_to_1000 {
    public static void main(String ar[]){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            if(i==2 || i==3 || i==4 || i==5 || i==6 || i==7 || i==8 || i==9){
                list.add(i);
            }
            if(armstrong(i)){
                list.add(i);
            }
        }
        System.out.println(list);
    }

    public static boolean armstrong(int num){
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
