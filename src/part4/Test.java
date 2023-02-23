package part4;

interface AB {
	int a = 10; // By default variables in interface are static and final

	void m1(); // Abstract method (Without implementation of code), by default public
}

class B {
	int b;
}

public class Test extends B implements AB {

	// Here we implement the method
	public void m1() {
		System.out.println(a);
	}

	public static void main(String[] args) {

		// He we can access to the method
		Test test = new Test();
		test.m1();

		// Another way to invoke m1
		AB a = new Test(); // Create memory for the interface, because interface don't have a memory by default
		a.m1();
	}

}
