package Leetcode_and_technical_Programs.LeetCode_Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]
public class TwoSum_with_HashMap_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15} , 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4} , 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,3} , 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,3} , 4)));
    }

    public static int[] twoSum(int[] arr , int target){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int remaining = target - arr[i];
            if(map.containsKey(remaining)){
                return new int[]{map.get(remaining),i};
            }else{
                map.put(arr[i],i);
            }
        }
        return new int[]{};
    }
}
