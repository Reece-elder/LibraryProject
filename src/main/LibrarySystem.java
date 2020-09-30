package main;

import java.util.ArrayList;

public class LibrarySystem {

	ArrayList<Item> library = new ArrayList<Item>();
	ArrayList<Customer> members = new ArrayList<Customer>();

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

	public void addItem(Item item) {
		library.add(item);
		System.out.println(item.getTitle() + " added to library");
	}

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

	public String itemDetails(String item) {
		String details = "";
		for (Item i : library) {
			if (i.getClass().getSimpleName().equalsIgnoreCase(item)) {
				details = i.details();
			}
		}
		return details;
	}

	public void allItemDetails() {

		for (Item i : library) {
			i.details();
		}
	}

	public String memberDetails(Customer person) {
		String details;
		details = "Name: " + person.getName() + "   Gender: " + person.getGender() + "   Age: " + person.getAge()
				+ "   Library Number: " + person.getLibraryNumber();
		System.out.println(details);
		return details;
	}

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
