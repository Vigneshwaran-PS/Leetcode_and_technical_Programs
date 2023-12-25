package Leetcode_and_technical_Programs.LeetCode_Problems;


//Example 1:
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
//Example 3:
//        Input: nums = [3,3], target = 6
//        Output: [0,1]


import java.util.Arrays;

public class Two_Sum_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(find(new int[]{2,7,11,15},9)));
        System.out.println(Arrays.toString(find(new int[]{3,2,4},6)));
        System.out.println(Arrays.toString(find(new int[]{3,3},6)));
    }

    public static int[] find(int[] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            for(int j= i+1;j < arr.length;j++){
                if(target == arr[i]+arr[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
