package Leetcode_and_technical_Programs.Technical_Problems;

public class Int_to_string {
    public static void main(String[] args) {
        int num = 1234563;

        String str = Integer.toString(num);

        StringBuilder sb = new StringBuilder(str);

        for(int i=0;i<str.length()-1;i+=2){
            String pair = str.substring(i,i+2);

            if(Integer.parseInt(pair)%2==0){
                sb.setCharAt(i+1,'1');
            }
        }

        System.out.println(sb);
    }
}
