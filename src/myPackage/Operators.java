package myPackage;

public class Operators {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		//Arithmetic operators --> + - * %
		System.out.println("-----------------------Arithmetic operators-----------------------");
		System.out.println("Sum of a and b is: " +(a+b));
		System.out.println("Diff of a and b is: " +(a-b)); //without () will do concat
		
		
		//Relational operators ---> == <> <= >= !=
		//Always return boolean value
		System.out.println("-----------------------Relational operators------------------------");
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a!=b);
		
		//Logical operators && || n!
		//works between to boolean
		boolean x = true;
		boolean y = false;
		System.out.println("------------------------Logical operators----------------------------------");
		
		System.out.println(x && y);//false
		System.out.println(x || y);//true
		System.out.println(!x);//false
		System.out.println(!y);//true
		
		System.out.println("--------------------------Increment/Decrement operators--------------------------");
		//Increment/Decrement operators ++/--
		a = 10;
		a=a+1; //a++;
		System.out.println(a);
		
		b = 20;
		b--; //b=b-1;
		System.out.println(b);

	}

}
