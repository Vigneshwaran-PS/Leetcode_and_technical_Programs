package Leetcode_and_technical_Programs.Technical_Problems;

public class Search_in_String {
    public static void main(String[] args) {
        String name = "Narendra D modi";
        System.out.println(search(name,'i'));
        System.out.println(search(name,'a'));
        System.out.println(search(name,'z'));
        System.out.println(search(name,'D'));
    }


    public static boolean search(String name , int target){

//        for(int i=0;i<name.length();i++){
//            if(target == name.charAt(i)){
//                return true;
//            }
//        }

        for(char ch : name.toCharArray()){
            if(target == ch){
                return true;
            }
        }
        return false;
    }
}
