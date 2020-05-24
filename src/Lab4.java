import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter Word: ");
            String word = scanner.next();
            if (word.contentEquals("exit")) break;

            if (isStringPalindrome(word)) {
                System.out.println("The word " + word + " IS a Palindrome\n");
            } else {
                System.out.println("The word " + word + " is NOT a Palindrome\n");
            }
        }
        scanner.close();
    }

    public static boolean isStringPalindrome(String str){
        int length = str.length();
        if (length <= 1) return true;

        return str.charAt(0) == str.charAt(length - 1) &&
                isStringPalindrome(str.substring(1, length - 1));
    }
}
