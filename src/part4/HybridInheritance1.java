package part4;


class C {
	public void disp() {
		System.out.println("C");
	}
}

class A extends C {
	public void disp() {
		System.out.println("A");
	}
}


class D extends A{
	public void disp() {
		System.out.println("D");
	}
}

public class HybridInheritance1 {

	public static void main(String[] args) {
		
		D obj = new D();
		obj.disp();

	}

}
