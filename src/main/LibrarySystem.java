package main;

import java.util.ArrayList;

public class LibrarySystem {
	
	//ArrayLists used to add and remove items for functionality
	ArrayList<Item> library = new ArrayList<Item>();
	ArrayList<Customer> members = new ArrayList<Customer>();

	//Checks if the item is checked out and who checked it out
	public Boolean checkOut(Item item, Customer customer) {
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

	//Checks in an item if it is checked out and takes in who checked it out
	public Boolean checkIn(Item item, Customer customer) {
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

	//Adds an item by variable name to the ArrayList
	public void addItem(Item item) {
		library.add(item);
		System.out.println(item.getTitle() + " added to library");
	}

	//Removes an item from the array list by ID number
	public void removeItem(int idNumber) {
		ArrayList<Item> removal = new ArrayList<>();

		for (Item i : library) {
			if (i.getItemID() == idNumber) {
				removal.add(i);
				System.out.println("Item for removal : " + i.getTitle() + "   ID Number: " + i.getItemID());
			}
		}
		this.library.removeAll(removal);
	}

	//Lists a specific items details
	public String itemDetails(int idNumber) {
		String details = "";
		for (Item i : library) {
			if (i.getItemID() == idNumber) {
				details = i.details();
			}
		}
		return details;
	}

	//Lists details of all items in arraylist
	public void allItemDetails() {

		for (Item i : library) {
			i.details();
		}
	}

	//Lists the details of a member by their name
	public String memberDetails(Customer person) {
		String details;
		details = "Name: " + person.getName() + "   Gender: " + person.getGender() + "   Age: " + person.getAge()
				+ "   Library Number: " + person.getLibraryNumber();
		System.out.println(details);
		return details;
	}

	//Adds a person to the library Member list
	public void registerMember(Customer person) {
		members.add(person);
		System.out.println(person.getName() + " has been added to the database");
	}

	public void unregisterMember(int idNumber) {
		ArrayList<Customer> removal = new ArrayList<>();
		
		for (Customer c : members) {
			if (c.getLibraryNumber() == idNumber) {
				removal.add(c);
				System.out.println("customer to be removed : " + c.getName() + "   ID Number: " + c.getLibraryNumber());
			}
		}
		
		this.library.removeAll(removal);
	}
}
