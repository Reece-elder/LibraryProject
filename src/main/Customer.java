package main;

public class Customer extends Person {
	
	private int libraryNumber;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, int age, Gender gender) {
		super(name, age, gender);
		this.libraryNumber = (int) (Math.random() * (999999 - 100001 + 1) + 100001);
		System.out.println(libraryNumber);
		// TODO Auto-generated constructor stub
	}

	public int getLibraryNumber() {
		return libraryNumber;
	}

	public void setLibraryNumber(int libraryNumber) {
		this.libraryNumber = libraryNumber;
	}
	
	
	
	

}
