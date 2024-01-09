package Leetcode_and_technical_Programs.Softsquare_Interview_Questions;



// Given a positive integer number , take each two integer from given number and divided by 2 ,
// if that number is divisible by 2 then change the second number as 1
// Eg : 1234563
// First take 12 and divided by 2 , which is 0 , so the second number "2" is changed into 1
// then take 34 and so on.
public class Int_to_String {
    public static void main(String[] args) {
        int num = 1234563;

        String str = Integer.toString(num);
        System.out.println("Original number: " + str);

        StringBuilder modifiedStr = new StringBuilder(str);

        for (int i = 0; i < str.length() - 1; i += 2) {
            String pair = str.substring(i, i + 2);

            if (Integer.parseInt(pair) % 2 == 0) {
                modifiedStr.setCharAt(i + 1, '1');
            }
        }

        System.out.println("Modified number: " + modifiedStr.toString());
    }
}
