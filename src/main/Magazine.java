package main;

public class Magazine extends Item{
	
	private int editionNumber;
	private String author;
	
	public Magazine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Magazine(String title, int loanTime, boolean checkedOut, int editionNumber, String author) {
		super(title, loanTime, checkedOut);
		this.editionNumber = editionNumber;
		this.author = author;
	}
	
	public int getEditionNumber() {
		return editionNumber;
	}

	public void setEditionNumber(int editionNumber) {
		this.editionNumber = editionNumber;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String details() {
		String details;
		details = "Item ID: " + this.getItemID() + "   Title : " + this.getTitle() + "   Author: " + this.getAuthor() + "   Edition Number: " + this.getEditionNumber() + "   Loan time: " + this.getLoanTime() + "   Checked out: " + this.isCheckedOut();
		System.out.println(details);
		return details;
	}

}
