package Leetcode_and_technical_Programs.Technical_Problems;

public class StringBufferExample12 {
    public static void main(String[] args) {

        System.out.println("\n==========================================\n");


        StringBuffer sb = new StringBuffer();
        System.out.println("Length of Empty String Buffer : " + sb.length());
        System.out.println("Cpacity of Empty String Buffer : " + sb.capacity());


        System.out.println("\n==========================================\n");


        StringBuffer sb1 = new StringBuffer(10);
        System.out.println("Length of Empty String Buffer : " + sb1.length());
        System.out.println("Cpacity of Empty String Buffer : " + sb1.capacity());


        System.out.println("\n==========================================\n");


        StringBuffer sb2 = new StringBuffer("Hi This is Java");
        System.out.println("Length of Empty String Buffer : " + sb2.length());
        System.out.println("Cpacity of Empty String Buffer : " + sb2.capacity());


    }
}
