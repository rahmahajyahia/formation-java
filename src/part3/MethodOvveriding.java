package part3;


class Bank{
	
	//same name
	double interesetRate() {
		return 0;
	}
	
}
	
	class SBI extends Bank {
		
		double interesetRate() {
			return 10.5;
		}
	}
	
 class ICICI extends Bank{
	 double interesetRate() {
		 return 8.5;
	 }
 }
 
 class AXIS extends Bank{
	 double interesetRate() {
		 return 9.5;
	 }
 }

public class MethodOvveriding {

	public static void main(String[] args) {
		
		SBI sbi = new SBI();
		System.out.println(sbi.interesetRate());
		
		ICICI icici = new ICICI();
		System.out.println(icici.interesetRate());
		
		AXIS axis = new AXIS();
		System.out.println(axis.interesetRate());

	}

}
