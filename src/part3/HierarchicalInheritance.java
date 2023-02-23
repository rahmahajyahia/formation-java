package part3;

class Parent {
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class Child1 extends Parent {
	int x;
	void show() {
		System.out.println(x);
	}
}

class Child2 extends Parent {
	
	int y;
	void print() {
		System.out.println(y);
	}
}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Child1 ch1 = new Child1();
		ch1.a = 100;
		ch1.x =30;
		ch1.display();
		ch1.show();
		
		Child2 ch2 = new Child2();
		ch2.a = 50;
		ch2.y = 30;
		ch2.display();
		ch2.print();

	}

}
