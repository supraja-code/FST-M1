package activities;

import java.util.ArrayList;

public class Activity9 {
	
	    public static void main(String[] args) {
	        
	        ArrayList<String> myList = new ArrayList<String>();
	        
	        myList.add("Home");
	        myList.add("Office");
	        myList.add("Restaurant");
	        
	        myList.add(3, "Stadium");
	        myList.add(1, "ShoppingMall");
	        
	        System.out.println("Print All the Objects:");
	        for(String s:myList){
	            System.out.println(s);
	        }
	        
	        System.out.println("3rd element in the list is: " + myList.get(2));
	        System.out.println("Is Chicku is in list: " + myList.contains("Hotel"));
	        System.out.println("Size of ArrayList: " + myList.size());
	        
	        myList.remove("Stadium");
	        
	        System.out.println("New Size of ArrayList: " + myList.size());
	    }
	

}
