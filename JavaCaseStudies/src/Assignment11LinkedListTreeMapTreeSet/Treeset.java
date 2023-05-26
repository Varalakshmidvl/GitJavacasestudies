package Assignment11LinkedListTreeMapTreeSet;

import java.util.*;
/*import java.util.Collections;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;*/

public class Treeset {

	public static void main(String[] args) {

	/*	TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(14);
		ts.add(7);
		ts.add(21);
		ts.add(28);
		for (Integer element : ts) {
			System.out.println(element);*/

		String arr[] = {"Michel","Camle","Arun","Joseph","Walter","Victor", "Amala"};
			  
			  TreeSet<String> st = new TreeSet<String>();
			  
			  for (String ar : arr) {
			  
			  st.add(ar); System.out.println("Total list of Names in sorted order : " +
			  st); 
			  }
		
		}
	}

