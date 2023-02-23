package part2;

public class MethodOverloading {
	
	//same name of method - different parameters
	
	void add(int a, int b) { //1
		System.out.println(a + b);
	}
	
	void add(int a, double b) { //2
		System.out.println(a + b);
	}
	
	void add(double a, double b) { //3
		System.out.println(a+ b);
	}
	
	void add(int a, int b, int c) { //4
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		mo.add(10, 20);
		mo.add(10, 20.30);
		mo.add(10.5, 20.5);
		mo.add(10, 20, 30);
		

	}

}
