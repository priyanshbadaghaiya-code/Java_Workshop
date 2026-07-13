
public class PatternEx1 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the no.of rows:");
		int n = sc.nextInt();
		char ch='A';
		for (int a=1; a<=n;a++) {
			for (int i = 0; i < a; i++) {
				System.out.print(ch+=i);
			}
			System.out.println();
		}
	}
}
