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
	
	@Override
	public String details() {
		String details;
		details = "Item ID: " + this.getItemID() + "   Title : " + this.getTitle() + "   Author: " + this.getAuthor() + "   Page Count: " + this.getPageNumbers() + "   Loan time: " + this.getLoanTime() + "   Checked out: " + this.isCheckedOut();
		System.out.println(details);
		return details;
	}

	public int getPageNumbers() {
		return pageNumbers;
	}

	public void setPageNumbers(int pageNumbers) {
		this.pageNumbers = pageNumbers;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
