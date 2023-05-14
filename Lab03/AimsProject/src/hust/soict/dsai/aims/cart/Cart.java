package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc [MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;


	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (this.qtyOrdered + 1 > MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
		}
		else {
			for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
				if (this.itemsOrdered[i] == null) {
					this.itemsOrdered[i] = disc;
					break;
				}
			}
			this.qtyOrdered ++;
			System.out.println("The disc has been added");
		}
	}
	public void addDigitalVideoDisc (DigitalVideoDisc dvdList[]) {
		if (this.qtyOrdered + dvdList.length > MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
			return;
		}
		for (DigitalVideoDisc disc: dvdList) {
			addDigitalVideoDisc(disc);
		}
	}
	public void addDigitalVideoDisc (DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (this.qtyOrdered + 2 > MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
			return;
		}
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}


	public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
		for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
			if (this.itemsOrdered[i].equals(disc)) {
				this.itemsOrdered[i] = null;
				break;
			}
		}
		this.qtyOrdered -= 1;
	}

	
	public float totalCost() {
		float cost = 0;
		for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
			if (this.itemsOrdered[i] != null) {
				cost += this.itemsOrdered[i].getCost();
			}
		}
		return cost;
	}
	
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (DigitalVideoDisc disc: this.itemsOrdered) {
			if (disc == null) {
				continue;
			}
			System.out.println(disc.getDetail());
		}
		System.out.printf("Total cost: %f\n", totalCost());
		System.out.println("***************************************************");
	}
	

	public void search(int id) {
		boolean found = false;
		for (DigitalVideoDisc disc: this.itemsOrdered) {
			if (disc == null) {
				continue;
			}
			if (disc.getid() == id) {
				System.out.println(disc.getDetail());
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("No match is found");
		}
	}
	public void search(String title) {
		boolean found = false;
		for (DigitalVideoDisc disc: this.itemsOrdered) {
			if (disc == null) {
				continue;
			}
			if (disc.search(title)) {
				System.out.println(disc.getDetail());
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("No match is found");
		}
	}
}