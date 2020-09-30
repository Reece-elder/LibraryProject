package main;

public class Runner {

	public static void main(String[] args) {
		
		LibrarySystem librarySystem = new LibrarySystem();
		
		Item book = new Book("title",14,false, 320,"J.Smith");
		Item book2 = new Book("title2",118,false, 1451,"T.Smith");
		Item magazine1 = new Magazine("Wired", 21, false, 23,"Judi Abbott");
		Item magazine2 = new Magazine("Q", 14, false, 167,"K");
		Item dvd1 = new DVD("Blade 2", 10, false, 95, AgeRating._18);
		Item dvd2 = new DVD("Road to El Dorado", 7, false, 87, AgeRating._PG);
		
		
		Customer k_Acker = new Customer("Kathy Acker", 49, Gender.FEMALE);
		Customer r_Solomon = new Customer("Rivers Solomon", 34, Gender.NONBINARY);
		Customer g_Adams = new Customer("Guy Adams", 52, Gender.MALE);
		
		librarySystem.checkOut(book, k_Acker);
		librarySystem.checkOut(book, k_Acker);
		librarySystem.checkIn(book, k_Acker);
		librarySystem.checkIn(book, k_Acker);
		
		librarySystem.addItem(book);
		librarySystem.addItem(book2);
		librarySystem.addItem(magazine1);
		librarySystem.addItem(magazine2);
		librarySystem.addItem(dvd1);
		librarySystem.addItem(dvd2);
		
		librarySystem.removeItem(magazine1.getItemID());
		
		librarySystem.registerMember(g_Adams);
		librarySystem.registerMember(r_Solomon);
		librarySystem.registerMember(k_Acker);
		
		librarySystem.memberDetails(r_Solomon);
		librarySystem.memberDetails(g_Adams);
		librarySystem.itemDetails("book");
		librarySystem.allItemDetails();
		
	
		librarySystem.unregisterMember(k_Acker.getLibraryNumber());
		
		
		

	}

}
