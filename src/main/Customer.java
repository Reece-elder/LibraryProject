package main;

public class Customer extends Person {
	
	private int libraryNumber;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, int age, Gender gender, int libraryNumber) {
		super(name, age, gender);
		this.libraryNumber = libraryNumber;
		// TODO Auto-generated constructor stub
	}

	public int getLibraryNumber() {
		return libraryNumber;
	}

	public void setLibraryNumber(int libraryNumber) {
		this.libraryNumber = libraryNumber;
	}
	
	
	
	

}
