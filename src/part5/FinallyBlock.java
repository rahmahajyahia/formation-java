package part5;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("Program is started");
		System.out.println("Program is in progress");


		int a =  100;
		try {
			System.out.println(a/0);
		}catch(ArithmeticException e) {
			System.out.println("Entred into catch block");
		}finally {
			System.out.println("Entred into finalyy block");
		}
		
		System.out.println("Program is compiled");
		System.out.println("Program is in exited");


	}

}
