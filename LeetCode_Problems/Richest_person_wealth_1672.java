package Leetcode_and_technical_Programs.LeetCode_Problems;


//Input: accounts = [[1,2,3],[3,2,1]]
//        Output: 6
//        Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//        2nd customer has wealth = 3 + 2 + 1 = 6
//        Both customers are considered the richest with a wealth of 6 each, so return 6

public class Richest_person_wealth_1672 {
    public static void main(String[] args) {
        int arr[][] = { {2,3,5} , {2,4,2},{6,1,0,8}};
        System.out.println(richPerson(arr));
    }

    public static int richPerson(int[][] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
