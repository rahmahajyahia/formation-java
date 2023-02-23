package part5;

public class ExceptionExamples {

	public static void main(String[] args) {


		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
		//ArithmiticException
//		int a = 100;
//		
//		try {
//			System.out.println(a/0);
//		}catch(ArithmeticException e) {
//			e.printStackTrace();
//		}
		
		
		//NullPointerException
//		String s = null;
//		
//		try {
//		System.out.println(s.length());
//		} catch(NullPointerException e) {
//			e.printStackTrace();
//		}

		//NumberFormatException
//		String x = "abc";
//		int i = Integer.parseInt(x);
		
		//ArrayIndexOutOfBoundsException
		int arr[] = new int[5];
		arr[10] = 100;
		
		System.out.println("Program is compiled");
		System.out.println("Program is in exited");

	}

}
