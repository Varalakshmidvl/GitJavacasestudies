package Assignment9_Hashmap;

import java.util.HashMap;

public class HaspMap {
		
		public static void main(String[] args) {
				
			    HashMap<String, Integer> numbers = new HashMap<>();

			    System.out.println("Initial HashMap: " + numbers);
			    // put() method to add elements
			    numbers.put("One", 1);
			    numbers.put("Two", 2);
			    numbers.put("Three", 3);
			    System.out.println("HashMap after put(): " + numbers);
			}

		}
		
