package Leetcode_and_technical_Programs.Softsquare_Interview_Questions;


// given a string
// print the string but print the word twice if it starts in vowel
public class Vowels_Word_Doubling {
    public static void main(String[] args) {
        String str = "instagram scammers are literallty increasing now a days because people's are mostly aware of it";
        String arr[] = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].charAt(0) == 'a' || arr[i].charAt(0) == 'e' || arr[i].charAt(0) == 'i' || arr[i].charAt(0) == 'o' || arr[i].charAt(0) == 'u') {
                System.out.print(arr[i] + " ");
            }
            for(int j=i;j<=i;j++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
