public class StringEx2 {
	public static void main(String[] args) {
		String s1=new String("Priyansh");
		String s2="Priyansh";
		String s3=new String("Priyansh");
		String s4="Priyansh";
		String s5=new String("Priyansh");
		String s6="Priyansh";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s1==s3);//false [== is comparing the references of String]
		System.out.println(s2==s4);//true
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true [equals() is comparing the data of String]
		System.out.println(s1.equals(s3));//true
		System.out.println(s3.equals(s4));//true
		s1="Ram";
		s2=null;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));//NullPointerException
	}
}
