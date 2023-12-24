package Leetcode_and_technical_Programs.LeetCode_Problems;


//Example 1:
//        Input: letters = ["c","f","j"], target = "a"
//        Output: "c"
//        Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
//Example 2:
//        Input: letters = ["c","f","j"], target = "c"
//        Output: "f"
//        Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
//Example 3:
//        Input: letters = ["x","x","y","y"], target = "z"
//        Output: "x"
//        Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].

public class Find_Smallest_Letter_Greater_Than_Target_744 {
    public static void main(String[] args) {
        System.out.println(find(new char[]{'c','f','j'}, 'a'));
        System.out.println(find(new char[]{'c','f','j'} , 'c'));
        System.out.println(find(new char[]{'x','x','y','y'} , 'z'));
    }

    public static char find(char[] arr , char target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){

            int mid =  start + (end - start)/2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
