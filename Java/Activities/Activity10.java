package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
       
        hs.add("S");
        hs.add("U");
        hs.add("P");
        hs.add("R");
        hs.add("A");
        hs.add("J");
        
        System.out.println("Original HashSet: " + hs);        
        
        System.out.println("Size of HashSet: " + hs.size());
        
        System.out.println("Removing A from HashSet: " + hs.remove("A"));
        
        if(hs.remove("Z")) {
        	System.out.println("Z removed from the Set");
        } else {
        	System.out.println("Z is not present in the Set");
        }
        
        System.out.println("Checking if M is present: " + hs.contains("M"));
        
        System.out.println("Updated HashSet: " + hs);

	}

}
