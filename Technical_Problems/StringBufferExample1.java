package Leetcode_and_technical_Programs.Technical_Problems;

public class StringBufferExample1 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("hai");
        StringBuffer sb2 = new StringBuffer("welcome");
        System.out.println("Append : "+sb1.append(" How are you"));
        System.out.println("sb1 : "+sb1);
        System.out.println("Append sb1 and sb2 : " + sb1.append(" "+sb2));
        System.out.println("Length : " + sb1.length());
        System.out.println("Char At : " + sb1.charAt(0));
        System.out.println("Insert : " + sb1.insert(3," student"));
        System.out.println("Delete : " + sb1.delete(3,11));
        System.out.println("Reverse : " + sb1.reverse());
        System.out.println("sb1 : " + sb1);

        System.out.println("\n==========================================\n");


        StringBuffer sb3 = new StringBuffer("my name is ");
        char[] arr = {'a','p','t','e','c','h'};
        System.out.println("Insert : "+sb3.insert(11,arr));
        System.out.println("Insert : "+sb3.insert(17,arr,0,2));

        System.out.println("\n==========================================\n");

        StringBuffer sb4 = new StringBuffer("hi");
        System.out.println("Insert : " + sb4.insert(2," p"));
        System.out.println("Insert : " + sb4.insert(4," s"));
        System.out.println("Insert : " + sb4.insert(6," vigneshwaran"));
        System.out.println("Delete : " + sb4.delete(3,6));
    }
}
