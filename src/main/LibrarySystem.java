package main;

public class LibrarySystem {
	
	public void checkOut(Item item) {
		System.out.println(item.isCheckedOut());
		item.setCheckedOut(true);
		System.out.println(item.isCheckedOut());
	}
	
	

}
