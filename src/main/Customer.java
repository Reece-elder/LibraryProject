package main;

import java.util.UUID;

public class Customer extends Person {
	
	private int libraryNumber;
	private static int idNumber = 1000; 

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, int age, Gender gender) {
		super(name, age, gender);	
		this.libraryNumber = idNumber;
		idNumber += 1;
		// TODO Auto-generated constructor stub
	}

	public int getLibraryNumber() {
		return libraryNumber;
	}

	public void setLibraryNumber(int libraryNumber) {
		this.libraryNumber = libraryNumber;
	}
	
	
	
	

}
