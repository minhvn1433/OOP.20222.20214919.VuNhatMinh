package hust.soict.dsai.aims.cart;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
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
		for (Media media: itemsOrdered) {
			if (media == null) {
				continue;
			}
			System.out.println(media.toString());
		}
		System.out.printf("Total cost: %f\n", totalCost());
		System.out.println("***************************************************");
	}
	

	public void search(int id) {
		boolean found = false;
		for (Media media: itemsOrdered) {
			if (media.getId() == id) {
				if (media instanceof Book) {
					Book b = (Book) media;
					System.out.println(b.toString());
					return;
				}
				else if (media instanceof CompactDisc) {
					CompactDisc cd = (CompactDisc) media;
					System.out.println(cd.toString());
					return;
				}
				else if (media instanceof DigitalVideoDisc) {
					DigitalVideoDisc dvd = (DigitalVideoDisc) media;
					System.out.println(dvd.toString());
					return;
				}
			}
		}
		System.out.println("No match is found");
		return;
	}
	public void search(String title) {
		for (Media media: itemsOrdered) {
			if (media == null) {
				if (media instanceof Book) {
					Book b = (Book) media;
					System.out.println(b.toString());
					return;
				}
				else if (media instanceof CompactDisc) {
					CompactDisc cd = (CompactDisc) media;
					System.out.println(cd.toString());
					return;
				}
				else if (media instanceof DigitalVideoDisc) {
					DigitalVideoDisc dvd = (DigitalVideoDisc) media;
					System.out.println(dvd.toString());
					return;
				}
			}
		}
		System.out.println("No match is found");
		return;
	}
}
