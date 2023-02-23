package part1;

public class ConstructorDemo {
	
	int x;
	int y;
	
//Default constructor
//	ConstructorDemo(){
//		x = 20;
//		y = 10;
//	}
	
	//Parameterized constructor
	ConstructorDemo(int a, int b){
		x = a;
		y = b;
	}
	
	
	
	void display() {
		System.out.println(x + y);
	}


	public static void main(String[] args) {
		//ConstructorDemo cm = new ConstructorDemo(); // Invoke default constructor
		
		ConstructorDemo cm = new ConstructorDemo(100, 200); // Invoke param constructor
		cm.display();


}
	
}
