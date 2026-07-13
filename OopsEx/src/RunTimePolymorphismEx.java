class Animal_{
	void eat() {
		System.out.println("Animal's Eat");
	}
}
class Dog extends Animal_{
	void eat() {
		System.out.println("Dog's Eat");
	}
}
class Elephant extends Animal_{
	void eat() {
		System.out.println("Elephant's Eat");
	}
}
class Cat extends Animal_{
	void eat() {
		System.out.println("Cat's Eat");
	}
}
public class RunTimePolymorphismEx {
	public static void main(String[] args) {
		
		
		Animal_ a;
		a=new Animal_();
		a.eat();
		a=new Dog();
		a.eat();
		a=new Cat();
		a.eat();
		a=new Elephant();
		a.eat();
		
		//or
		
		Animal_ a1=new Animal_();
		a1.eat();
		Animal_ a2=new Dog();
		a2.eat();
		Animal_ a3=new Cat();
		a3.eat();
		Animal_ a4=new Elephant();
		a4.eat();
	}
}