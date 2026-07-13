import java.util.Scanner;

public class GreatestOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int greatest;

        if (a > b) {
            if (a > c) {
                if (a > d)
                    greatest = a;
                else
                    greatest = d;
            } else {
                if (c > d)
                    greatest = c;
                else
                    greatest = d;
            }
        } else {
            if (b > c) {
                if (b > d)
                    greatest = b;
                else
                    greatest = d;
            } else {
                if (c > d)
                    greatest = c;
                else
                    greatest = d;
            }
        }

        System.out.println("Greatest number = " + greatest);
    }
}
