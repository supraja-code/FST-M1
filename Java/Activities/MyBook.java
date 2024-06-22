package activities;

abstract class Book {
	String title;
	
	abstract void setTitle(String s);
	
	public String getTitle() {
		return this.title;
	}
}

public class MyBook extends Book{
	public void setTitle(String s) {
		title = s;
	}
}
