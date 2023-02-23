package part6;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		// Declare Hashmap
		// HashMap hm = new HashMap(); //Declaration 1

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// Adding pairs into HashMap
		hm.put(101, "Safwen");
		hm.put(102, "Fathi");
		hm.put(103, "Marwa");
		hm.put(104, "Roua");

		System.out.println(hm);

		// Removing a pairs from HashMap
		hm.remove(103);
		System.out.println("After removing a pair: " + hm);

		// Reading pairs using enhanced for loop
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
