// Write a program to calculate simple interest and all the values given by user . 
public class Si {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		float p= sc.nextFloat();
		float r= sc.nextFloat();
		float t=sc.nextFloat();
		float si=p*r*t/100;
		System.out.println(si);
	}

}
