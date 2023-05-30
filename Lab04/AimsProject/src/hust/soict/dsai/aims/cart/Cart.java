package hust.soict.dsai.aims.cart;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;

public class Cart {
	
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();


	public float totalCost() {
		float cost = 0;
		for (Media media: itemsOrdered) {
			cost += media.getCost();
		}
		return cost;
	}


	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}


	public void addMedia(Media media) {
		if (itemsOrdered.size() + 1 > MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
		}
		else {
			itemsOrdered.add(media);
		}
	}

	
	public void removeMedia(Media media) {
		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
		}
	}


	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (Media m: itemsOrdered) {
			System.out.println(m.toString());
		}
		System.out.printf("Total cost: %f\n", totalCost());
		System.out.println("***************************************************");
	}
	

	public void searchById(int id) {
		for (Media m: itemsOrdered) {
			if (m.getId() == id) {
				if (m instanceof CompactDisc) {
					CompactDisc cd = (CompactDisc) m;
					System.out.println(cd.toString());
					return;
				}
				else if (m instanceof DigitalVideoDisc) {
					DigitalVideoDisc dvd = (DigitalVideoDisc) m;
					System.out.println(dvd.toString());
					return;
				}
				else if (m instanceof Book) {
					Book b = (Book) m;
					System.out.println(b.toString());
					return;
				}
			}
		}
		System.out.println("No match is found");
		return;
	}


	public void searchByTitle(String title) {
		for (Media m: itemsOrdered) {
			if (m.getTitle().equals(title)) {
				if (m instanceof CompactDisc) {
					CompactDisc cd = (CompactDisc) m;
					System.out.println(cd.toString());
					return;
				}
				else if (m instanceof DigitalVideoDisc) {
					DigitalVideoDisc dvd = (DigitalVideoDisc) m;
					System.out.println(dvd.toString());
					return;
				}
				else if (m instanceof Book) {
					Book b = (Book) m;
					System.out.println(b.toString());
					return;
				}
			}
		}
		System.out.println("No match is found");
		return;
	}
}
