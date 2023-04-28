public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc [MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 1;

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (this.qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
		}
		else {
			for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
				if (this.itemsOrdered[i] == null) {
					this.itemsOrdered[i] = disc;
					break;
				}
			}
			this.qtyOrdered += 1;
			System.out.println("The disc has been added");
		}
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
}