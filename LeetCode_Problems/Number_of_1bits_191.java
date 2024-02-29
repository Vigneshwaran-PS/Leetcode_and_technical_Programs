package Leetcode_and_technical_Programs.LeetCode_Problems;

//
//Example 1:
//
//Input: n = 00000000000000000000000000001011
//Output: 3
//Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
//        Example 2:
//
//Input: n = 00000000000000000000000010000000
//Output: 1
//Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.
//        Example 3:
//
//Input: n = 11111111111111111111111111111101
//Output: 31
//Explanation: The input binary string 11111111111111111111111111111101 has a total of thirty one '1' bits.

public class Number_of_1bits_191 {

    public static void main(String[] args) {
        System.out.println(find(00000000000000000000000000001011));
        System.out.println(find(00000000000000000000000010000000));
        System.out.println(find(00000000000000000000011111111101));
    }

    public static int find(int num){
        int count = 0;
        for(int i=0;i<32;i++){
            if((num&1)==1){
                count++;
            }
            num>>=1;
        }
        return count;
    }
}
