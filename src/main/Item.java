package main;

public abstract class Item {
	
	private String title;
	private int loanTime;
	private boolean checkedOut = false; 
	
	public Item() {
		super();
	}
	
	public Item(String title, int loanTime, boolean checkedOut) {
		super();
		this.title = title;
		this.loanTime = loanTime;
		this.checkedOut = checkedOut;
	}
	
	public String details() {
		return title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLoanTime() {
		return loanTime;
	}

	public void setLoanTime(int loanTime) {
		this.loanTime = loanTime;
	}

	public boolean isCheckedOut() {
		return checkedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}
	
	

}
