package Assignment11LinkedListTreeMapTreeSet;
import java.util.Iterator;
import java.util.TreeSet;
public class TreeSet2 {
	public static void main(String[] args) {
		 
        // creating TreeSet object of type String
        TreeSet<String> tset = new TreeSet<String>();
 
        // adding elements to TreeSet object
        tset.add("Samsung");
        tset.add("iPhone");
        tset.add("OnePlus");
        tset.add("Motorola");
        tset.add("iPhone"); // duplicate object
        tset.add("Micromax");
 
       //  Iterating using enhanced for-loop 
        System.out.println(" Iterating using"
                + " enhanced for-loop \n");
        for(String str : tset) {
            System.out.println(str);
        }
 
       // Iterating using Iterator of Collection interface
        System.out.println(" Iterating using"
                + " Iterator of Collection interface\n");
        Iterator<String> itr = tset.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
 
       // Iterating using forEach loop 
        System.out.println(" Iterating using"
                + " forEach loop \n");
        tset.forEach(fone -> System.out.println(fone));
    }
}
