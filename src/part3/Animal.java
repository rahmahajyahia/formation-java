package part3;

//1
public class Animal {
	
	String color = "White";
	
	//2
	void eating() {
		System.out.println("Eating ........................");
	}
	
	//3
	Animal(){ //Constructor
		System.out.println("Animal is created");
	}

}


class Dog extends Animal{
	
	//we can also call this overriding - different body
	String color = "Black";
	
	Dog(){
		super();
		System.out.println("Dog is created");
	}
	
	//1
	void displayColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
	
	
	void eating() {
		System.out.println("Eating bread ..........................");
		super.eating();
	}
	
}
