
//public class IfEx1 {
//
//	public static void main(String[] args) {
//		java.util.Scanner sc= new java.util.Scanner(System.in);
//		System.out.println("Enter your age");
//		
//		int age = sc.nextInt();
//		
//		if (age >= 18) {
//			System.out.println("Elegible for voting");
//		
//		}
//		else {
//		System.out.println("Not Elegible for voting");
//
//	}
//
//}
//}


public class IfEx1{

	public static void main(String[] args) {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("Enter your age");
		
		int age = sc.nextInt();
		if(age>=13 && age<19) {
			System.out.println("You're teenager");
		}else {
			System.out.println("You're not teenager");
		
		}
		System.out.println("Thank you");
	}
}