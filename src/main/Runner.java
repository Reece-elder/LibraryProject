package main;

public class Runner {

	public static void main(String[] args) {
		
		LibrarySystem librarySystem = new LibrarySystem();
		
		Item book = new Book("title",14,false, 320,"J.Smith");
		Person johnS = new Customer("John Smith", 27, Gender.MALE, 47);
		
		librarySystem.checkOut(book);
		
		
		

	}

}
