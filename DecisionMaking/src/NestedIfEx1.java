// WAP to check whether a number is positive or negative or zero . 
//If the number is positive also print whether its even or odd.
public class NestedIfEx1 {
	public static void main (String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int num = sc.nextInt();
		if (num >0) {
			System.out.println("Positive");
			if(num%2==0) {
				System.out.println("Even");
		
			}else{
				System.out.println("Odd");
			}	
		}else if(num<0) {
				System.out.println("Negarive");
				
			}else {
				System.out.println("Zero");
			
		}
		
		System.out.println("Thank you");
	}
	
}

