package overridingDemo;

class Animal{
	void sound() {
		System.out.println("Each Animal has it's own sound");
	}
	
}
class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("dog sound is barking");
	}
}
class Cat extends Animal {
	void sound() {
		System.out.println("cat sound is Meow");
	}
}
class Cow extends Animal {
	void sound() {
		System.out.println("cow sound is Moo");
	}
}


public class OverridingClass {

	public static void main(String[] args) {
		Dog obj1= new Dog();
		obj1.sound();
		Cat obj2= new Cat();
		obj2.sound();
		Cow obj3= new Cow();
		obj3.sound();

	}

}
