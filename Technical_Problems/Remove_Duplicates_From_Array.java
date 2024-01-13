package Leetcode_and_technical_Programs.Technical_Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates_From_Array {
    public static void main(String[] args) {
        int arrDuplicates[] = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,0,0,1,2,3,4,5,6,7,8,9};

        Set<Integer> set = new HashSet<>();

        for(int num : arrDuplicates){
            set.add(num);
        }

        System.out.println(set);

        int newArr[] = new int[set.size()];
        int index= 0;

        for(int num : set){
            newArr[index++] = num;
        }

        System.out.println(Arrays.toString(newArr));
    }
}
