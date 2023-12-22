package Leetcode_and_technical_Programs.Leetcode_Problems;

public class List_of_ArmstrongNumber {
    public static void main(String[] args) {
        int arr[] = {1,790,370,9,154,89,153,371,153,45,6,23,67,463};
        for(int num : arr){
            if (armstrong(num)) {
                System.out.println(num);
            }
        }
    }
    public static boolean armstrong(int num){
        int temp = num;
        int cubeSum = 0;
        while(num > 0){
            int rem = num % 10;
            cubeSum = cubeSum + (int)Math.pow(rem,3);
            num/=10;
        }
        return temp == cubeSum;
    }
}
