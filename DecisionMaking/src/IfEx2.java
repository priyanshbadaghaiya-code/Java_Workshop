
public class IfEx2 {
	public static void main (String [] args) {
		java.util.Scanner sc = new  java.util.Scanner (System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("this is an even number");
			}
		else {
			System.out.println("this is an odd  number" );
		}
		
		}
}
