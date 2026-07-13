import java.util.Scanner;

public class AlphabetAndVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                System.out.println("It is an Alphabet and a Vowel");
            } else {
                System.out.println("It is an Alphabet but not a Vowel");
            }

        } else {
            System.out.println("It is not an Alphabet");
        }
    }
}
