public class ClassObjectEx5 {
	int x;
	String y;
	void show() {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		ClassObjectEx5 a=new ClassObjectEx5();
		a.x=10;
		a.y="KK";
		ClassObjectEx5 b=new ClassObjectEx5();
		b.y="Ram";
		b.x=90;
		a.show();
		b.show();
	}
}
