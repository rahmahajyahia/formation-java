package part1;

public class Calculation {
	
	int x = 10;
	int y = 20;
	
	//case-1: Not taking parameters and also not returned any value
//	void sum() {
//		//body
//		System.out.println(x+y);
//	}
	
	
	
	//case-2: Not taking parameters but returning value
//	int sum() {
//		return (x + y);
//	
//	}
	
	
	
	//case-3: Taking parameters but not returning value
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	
	
	//case-4:Taking parameters and also returning a value
//	int sum(int a, int b) {
//		return a+b;
//	}

	public static void main(String[] args) {
		
		Calculation cal = new Calculation();
		//cal.sum(); // case 1
//		int res = cal.sum(); //case 2 
//		System.out.println(res);
		cal.sum(100, 200); //case 3
	//	System.out.println(cal.sum(100, 200)); //case 4 

		
		

	}

}
