package myPackage;

public class StringMethods {

	public static void main(String[] args) {

		String s = "welcome";
		String s1 = "to java";
		
		//Length of a string
		System.out.println(s.length());
		
		//Joining of a string 
		System.out.println(s.concat(s1));
		
		//Trimming the string
		s = "             welcome           ";
		System.out.println("Before trimming string is: " +s);
		
		//Remove space
		System.out.println("After trimming string is: " +s.trim());
		
		//charAt()
		s = "welcome";
		System.out.println(s.charAt(4));
		
		//contains() ==> return true
		System.out.println(s.contains("wel"));
		System.out.println("com");
		
		//comparing string equals()
		System.out.println(s.equals("welcome"));//true
		System.out.println(s.equals("Welcome"));//false
		System.out.println(s.equals("wel   come"));//false
		
		//replacing characters 
		s = "welcome to java";
		System.out.println(s.replace('o', 'i'));
		System.out.println(s.replace("java", "selenium")); //welcome to selenium
		
		//extracting substring from the main string
		s = "Welcome";
		System.out.println(s.substring(0, 4));//Welc
		
		//converting case
		s = "WELCOME";
		System.out.println(s.toLowerCase()); //welcome
		
		s = "welcome";
		System.out.println(s.toUpperCase()); //WELCOME
		
		
		

	}

}
