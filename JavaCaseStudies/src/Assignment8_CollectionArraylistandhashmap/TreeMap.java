package Assignment8_CollectionArraylistandhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.*;
public class TreeMap {
public static void main(String[] args) 
{
// Create a HashMap.	
   HashMap<String, String> hmap = new HashMap<>();
 
// Adding entries in hash map.
   hmap.put("R", "Red");
   hmap.put("G", "Green");
   hmap.put("B", "Brown");
   hmap.put("O", "Orange");
   hmap.put("P", "Pink");

   System.out.println("Entries of HashMap: " +hmap);

// Create a TreeMap from the previous HashMap.
   TreeMap tmap = new TreeMap();
   System.out.println("Entries in ascending order of keys: " +tmap);

// Create a LinkedHashMap.
   LinkedHashMap<String, String> lhmap = new LinkedHashMap<>(); 
  
   lhmap.put("R", "Red");
   lhmap.put("G", "Green");
   lhmap.put("B", "Brown");
   lhmap.put("O", "Orange");
   lhmap.put("P", "Pink");

   System.out.println("Entries in LinkedHashMap: " +lhmap);
 }
}