package activities;

public class Activity5{

public static void main(String[] args) {
	
	MyBook newNovel = new MyBook();
	
	String title = "new title";
	
	newNovel.setTitle(title);
	
	System.out.println("Title: " + newNovel.getTitle());
}

}