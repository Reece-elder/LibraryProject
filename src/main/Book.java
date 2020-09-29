package main;

public class Book extends Item{
	
	private int pageNumbers;
	private String author;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String title, int loanTime, boolean checkedOut, int pageNumbers, String author) {
		super(title, loanTime, checkedOut);
		this.pageNumbers = pageNumbers;
		this.author = author;
	}
	
	
	
	


}
