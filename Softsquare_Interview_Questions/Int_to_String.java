package Leetcode_and_technical_Programs.Softsquare_Interview_Questions;

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
