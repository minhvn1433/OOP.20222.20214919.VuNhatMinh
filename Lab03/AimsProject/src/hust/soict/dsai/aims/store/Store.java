package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[] {};
	

	public void addDVD(DigitalVideoDisc dvd) {
		int n = this.itemsInStore.length;
		DigitalVideoDisc newItemsInStore[] = new DigitalVideoDisc[n + 1];
		for (int i = 0; i < n; i++) {
			newItemsInStore[i] = itemsInStore[i];
		}
		newItemsInStore[n] = dvd;
		this.itemsInStore = newItemsInStore;
	}


	public void removeDVD(DigitalVideoDisc dvd) {
		boolean found = false;
		int n = this.itemsInStore.length;
		for (DigitalVideoDisc disc: this.itemsInStore) {
			if (disc == dvd) {
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("No match is found");
		}
		else {
			int index = 0;
			DigitalVideoDisc newItemInStore[] = new DigitalVideoDisc[n - 1];
			for (int i = 0; i < n; i++) {
				if (itemsInStore[i] == dvd) {
					index = i;
					break;
				}
			}
			for (int i = 0; i < index; i++) {
				newItemInStore[i] = itemsInStore[i];
			}
			for (int i = index + 1; i < n; i++) {
				newItemInStore[i - 1] = itemsInStore[i];
			}
			this.itemsInStore = newItemInStore;
		}
	}


	public void print() {
		for (DigitalVideoDisc disc: this.itemsInStore) {
			System.out.println(disc.getDetail());
		}
	}
}
