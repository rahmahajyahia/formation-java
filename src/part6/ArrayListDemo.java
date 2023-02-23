package part6;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		//How to declare array list
//		ArrayList list = new ArrayList(); //We can store any type of element (String / Integer)
//		ArrayList <Integer> list = new ArrayList<Integer>(); //Store Integer elements
		
		ArrayList<String> list = new ArrayList<String>(); // Store string elements
		
		//How to add elements / values to array list
		list.add("Safwen"); //0
		list.add("Amina"); //1
		list.add("Fatma");
		list.add("Besma");
		list.add("Lara");
		
		
	//	list.add(100); //add number (Integer)
		//list.add('A'); //character
		
		//Print all the value
		System.out.println(list);
		
		//Size of array list
		System.out.println(list.size());
		System.out.println("Before removing element: "  +list);
		
		//Remove an element
		list.remove(2);
		System.out.println(list.size());
		System.out.println("After removing element: "  +list);
		
		
		//Insert a new element into array list
		list.add(3, "Zied");
		System.out.println(list.size());
		System.out.println("After insert element: "  +list);
		
		//Read values from array list using for loop (enhanced for loop)
//		for(String s : list) {
//			System.out.println(s);
//		}
		
		// Object we can store any type of values
		for(Object s : list) {
			System.out.println(s);
		}
	}

}
