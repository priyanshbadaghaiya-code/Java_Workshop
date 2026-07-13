import java.util.Scanner;

public class GreatestOfThreeNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("Greatest number = " + a);
            } else {
                System.out.println("Greatest number = " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Greatest number = " + b);
            } else {
                System.out.println("Greatest number = " + c);
            }
        }
    }
}
