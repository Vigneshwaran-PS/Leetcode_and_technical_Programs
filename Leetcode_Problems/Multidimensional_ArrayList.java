package Leetcode_and_technical_Programs.Leetcode_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional_ArrayList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        System.out.println(list);

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                list.get(i).add(s.nextInt());
//            }
//        }
//        System.out.println(list);

        int x = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(x++);
            }
        }

        System.out.println(list);
    }
}
