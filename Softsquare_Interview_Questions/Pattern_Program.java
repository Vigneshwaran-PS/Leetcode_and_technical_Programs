package Leetcode_and_technical_Programs.Softsquare_Interview_Questions;

import java.util.Scanner;

public class Pattern_Program {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<=n;k++){
                if(k%2==0){
                    System.out.print("$");
                }else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
