package Leetcode_and_technical_Programs.Leetcode_Problems;

public class List_of_PrimeNumbers {
    public static void main(String[] args) {
        int arr[] = {23,1,89,79,69,33,2,0,31,71,43,99,15,30};
        for(int num : arr){
            if(num==1 || num==0){
                continue;
            }
            if(prime(num)){
                System.out.print(num + " ");
            }
        }
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
