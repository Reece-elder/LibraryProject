package main;

public class Runner {

	public static void main(String[] args) {
		
		LibrarySystem librarySystem = new LibrarySystem();
		
		Item book = new Book("title",14,false, 320,"J.Smith");
		Item book2 = new Book("title2",118,false, 1451,"T.Smith");
		Item book3 = new Book("title3",678,false, 68,"A.Smith");
		Person johnS = new Customer("John Smith", 27, Gender.MALE, 47);
		
		librarySystem.checkOut(book, johnS);
		librarySystem.checkOut(book, johnS);
		librarySystem.checkIn(book, johnS);
		librarySystem.checkIn(book, johnS);
		
		librarySystem.addItem(book);
		librarySystem.addItem(book2);
		librarySystem.addItem(book3);
		
		librarySystem.memberDetails(johnS);
		librarySystem.itemDetails("book");
		
		
		

	}

}
