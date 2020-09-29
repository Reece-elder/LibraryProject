package main;

import java.util.ArrayList;

public class LibrarySystem {
	
	ArrayList<Item> library = new ArrayList<Item>();
	ArrayList<Person> members = new ArrayList<Person>();
	
	public Boolean checkOut(Item item, Person customer) {
		if (!item.isCheckedOut()) {
			item.setCheckedOut(true);
			System.out.println(item.getTitle() + " has been checked out by " + customer.getName());
			return item.isCheckedOut();
		} else if (item.isCheckedOut()) {
			System.out.println(item.getTitle() + " is already checked out by " + customer.getName());
			return null;
		}
		return null;
	}
	
	public Boolean checkIn(Item item, Person customer) {
		if (item.isCheckedOut()) {
			item.setCheckedOut(false);
			System.out.println(item.getTitle() + " has been checked in by " + customer.getName());
			return item.isCheckedOut();
		} else if (!item.isCheckedOut()) {
			System.out.println(item.getTitle() + " isn't checked out");
			return null;
		}
		return null;
	}
	
	public void addItem(Item item) {
		library.add(item);
		System.out.println(item.getTitle() + " added to library");
	}
		
	public void removeItem(String item) {
		ArrayList<Item> removal = new ArrayList<>();
		
		for (Item i : library) {
			if(i.getClass().getSimpleName().equalsIgnoreCase(item)) {
				removal.add(i);
			}
		}
		System.out.println("Items for removal : " + removal);
		this.library.removeAll(removal);
	}
	
	public String itemDetails(String item) {
		String details = "";
		
		System.out.println("itemDetails called");
		for(Item i : library) {
			if(i.getClass().getSimpleName().equalsIgnoreCase(item)) {
				details = i.details();
			}
		}
		return details;
	}
	
//	public float calcBill(String type) {
//		//Calculates a bill for the vehicle repaired of class type
//		float bill = 0;
//		for (Vehicle obj : garage) {
//			if (obj.getClass().getSimpleName().equalsIgnoreCase(type)) {
//			bill += obj.calcRepair();
//			}
//
//		}
//		System.out.println(type + " repair cost: " + bill);
//		return bill;
//	}
	
	public String memberDetails(Person person) {
		String details;
		details = "Name: " + person.getName() + "   Gender: " + person.getGender() + "   Age: " + person.getAge();
		System.out.println(details);
		return details;
	}
	
	public void registerMember(Person person) {
		members.add(person);
		System.out.println(person.getName() + " has been added to the database");
	}

	
	
	
	

}
