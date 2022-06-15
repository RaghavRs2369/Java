package practice;

class Animal {
	public void eat() {
		System.out.println("I Can eat");
	}
}
class Dog extends Animal {
	public void eat() {
		System.out.println("I eat dog food");
	}
	public void bark() {
		System.out.println("I Can bark");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Dog labrador = new  Dog();
           labrador.eat();
           labrador.bark();
	}

}
