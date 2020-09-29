package main;

public class DVD extends Item{
	
	private int runTime;
	private AgeRating ageRating;
	
	
	public DVD() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DVD(String title, int loanTime, boolean checkedOut, int runTime, AgeRating ageRating) {
		super(title, loanTime, checkedOut);
		this.runTime = runTime;
		this.ageRating = ageRating;
	}
	
	public String details() {
		String details;
		details = "Title : " + this.getTitle() + "   Run Time: " + this.getRunTime() + "   Age Rating: " + this.getAgeRating() + "   Loan time: " + this.getLoanTime() + "   Checked out: " + this.isCheckedOut();
		System.out.println(details);
		return details;
	}
	

	public int getRunTime() {
		return runTime;
	}


	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}


	public AgeRating getAgeRating() {
		return ageRating;
	}


	public void setAgeRating(AgeRating ageRating) {
		this.ageRating = ageRating;
	}
	
	
	
	
	
	

}
