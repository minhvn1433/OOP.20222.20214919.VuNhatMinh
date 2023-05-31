package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.*;

import java.util.Collections;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Aims {

	private static Store store = new Store();
	private static Cart cart = new Cart();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		CompactDisc cd = new CompactDisc("The Lion King", "Animation", 19.95f, "Roger Allers", 87);
		store.addMedia(cd);
		DigitalVideoDisc dvd = new DigitalVideoDisc("Star Wars", "Science Fiction", 24.95f, "George Lucas", 87);
		store.addMedia(dvd);
		Book b = new Book("Aladin", "Animation", 18.99f);
		store.addMedia(b);

		showMenu();
	}


	// 0. Menu
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");

		int i = 0;
		try {
			i = scanner.nextInt();
		}
		catch(InputMismatchException exception) {
			System.out.println("Please choose a valid number");
			scanner.nextLine();
			showMenu();
			System.exit(0);
		}

		switch(i) {
			case 0:
				System.out.println("Bye bye");
				break;
			case 1:
				storeMenu();
				break;
			case 2:
				updateStore();
				break;
			case 3:
				cartMenu();
				break;
			default:
				System.out.println("Please choose a valid number");
				showMenu();
				break;
		}
	}


	// 1. View store
	public static void storeMenu() {
		System.out.println("Options:");
		System.out.println("--------------------------------");
		System.out.println("1. See a media's details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");

		int i = 0;
		try {
			i = scanner.nextInt();
		}
		catch (InputMismatchException exception) {
			System.out.println("Please choose a valid number");
			scanner.nextLine();
			storeMenu();
			System.exit(0);
		}

		switch(i) {
			case 0: 
				showMenu();
				break;
			case 1: 
				storeMenu1();
				break;
			case 2: 
				storeMenu2();
				break;
			case 3: 
				storeMenu3();
				break;
			case 4: 
				cartMenu();
				break;
			default: 
				System.out.println("Please choose a valid number");
				storeMenu();
				break;
		}
	}


	public static void storeMenu1() {
		scanner.nextLine();
		System.out.println("Enter title: ");
		String title = scanner.nextLine();
		boolean flag = true;

		for (Media m: store.getItemsInStore()) {
			if (m.getTitle().equals(title)) {
				System.out.println(m.toString());
				mediaDetailsMenu(m);
				flag = false;
			}
		}
		if (flag) {
			System.out.println("No match is found");
			storeMenu();
		}
	}


	public static void storeMenu2() {
		scanner.nextLine();
		System.out.println("Enter title: ");
		String title = scanner.nextLine();
		boolean flag = true;

		for (Media m: store.getItemsInStore()) {
			if (m.getTitle().equals(title)) {
				cart.addMedia(m);
				System.out.println("Number of medias in current cart: " + cart.getItemsOrdered().size());
				flag = false;
			}
		}
		if (flag) {
			System.out.println("No match is found");
		}
		storeMenu();
	}


	public static void storeMenu3() {
		scanner.nextLine();
		System.out.println("Enter title: ");
		String title = scanner.nextLine();
		boolean flag = true;

		for (Media m: store.getItemsInStore()) {
			if (m.getTitle().equals(title)) {
				if (m instanceof CompactDisc) {
					CompactDisc cd = (CompactDisc) m;
					cd.play();
				}
				else if (m instanceof DigitalVideoDisc) {
					DigitalVideoDisc dvd = (DigitalVideoDisc) m;
					dvd.play();
				}
				else if (m instanceof Book) {
					System.out.println("Cannot play");
				}
				flag = false;
			}
		}
		if (flag) {
			System.out.println("No match is found");
		}
		storeMenu();
	}


	public static void mediaDetailsMenu(Media media) {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");

		int i = 0;
		try {
			i = scanner.nextInt();
		}
		catch(InputMismatchException exception) {
			System.out.println("Please choose a valid number");
			scanner.nextLine();
			mediaDetailsMenu(media);
			System.exit(0);
		}

		switch(i) {
			case 0:
				storeMenu();
				break;
			case 1:
				cart.addMedia(media);
				System.out.println("Number of medias in current cart: " + cart.getItemsOrdered().size());
				storeMenu();
				break;
			case 2:
				if (media instanceof CompactDisc) {
					CompactDisc cd = (CompactDisc) media;
					cd.play();
				}
				else if (media instanceof DigitalVideoDisc) {
					DigitalVideoDisc dvd = (DigitalVideoDisc) media;
					dvd.play();
				}
				else if (media instanceof Book) {
					System.out.println("Cannot play");
				}
				storeMenu();
				break;
			default:
				System.out.println("Please choose a valid number");
				storeMenu();
				break;
		}
	}
	

	// 2. Update store
	public static void updateStore() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to store");
		System.out.println("2. Remove from store");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");

		int i = 0;
		try {
			i = scanner.nextInt();
		}
		catch(InputMismatchException exception) {
			System.out.println("Please choose a valid number");
			scanner.nextLine();
			updateStore();
			System.exit(0);
		}

		switch(i) {
			case 0:
				showMenu();
				break;
			case 1:
				updateStore1();
				break;
			case 2:
				updateStore2();
				break;
			default:
				System.out.println("Please choose a valid number");
				updateStore();
				break;
		}
	}


	public static void updateStore1() {
		scanner.nextLine();
		System.out.println("Enter title: ");
		String title = scanner.nextLine();
		System.out.println("Enter media type: ");
		String type = scanner.nextLine();

		switch(type.toLowerCase()) {
			case "compactdisc":
				CompactDisc cd = new CompactDisc(title);
				store.addMedia(cd);
				System.out.println("Number of medias in store: " + store.getItemsInStore().size());
				updateStore();
				break;
			case "digitalvideodisc":
				DigitalVideoDisc dvd = new DigitalVideoDisc(title);
				store.addMedia(dvd);
				System.out.println("Number of medias in store: " + store.getItemsInStore().size());
				updateStore();
				break;
			case "book":
				Book b = new Book(title);
				store.addMedia(b);
				System.out.println("Number of medias in store: " + store.getItemsInStore().size());
				updateStore();
				break;
			default:
				System.out.println("Please choose a valid media type");
				updateStore();
				break;
		}

	}


	public static void updateStore2() {
		scanner.nextLine();
		System.out.println("Enter title: ");
		String title = scanner.nextLine();
		boolean flag = true;

		for (Media m: store.getItemsInStore()) {
			if (m.getTitle().equals(title)) {
				store.removeMedia(m);
				System.out.println("Number of medias in store: " + store.getItemsInStore().size());
				flag = false;
			}
		}
		if (flag) {
			System.out.println("No match is found");
		}
		updateStore();
	}


	// 3. See current cart
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");

		int i = 0;
		try {
			i = scanner.nextInt();
		}
		catch(InputMismatchException exception) {
			System.out.println("Please choose a valid number");
			scanner.nextLine();
			cartMenu();
			System.exit(0);
		}

		switch(i) {
			case 0:
				showMenu();
				break;
			case 1:
				cartMenu1();
				break;
			case 2:
				cartMenu2();
				break;
			case 3:
				cartMenu3();
				break;
			case 4:
				cartMenu4();
				break;
			case 5:
				cartMenu5();
				break;
			default:
				System.out.println("Please choose a valid number");
				cartMenu();
				break;
		}
	}


	public static void cartMenu1() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter by id");
		System.out.println("2. Filter by title");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");

		int i = 0;
		try {
			i = scanner.nextInt();
		}
		catch(InputMismatchException exception) {
			System.out.println("Please choose a valid number");
			scanner.nextLine();
			cartMenu1();
			System.exit(0);
		}

		switch(i) {
			case 0:
				cartMenu();
				break;
			case 1:
				System.out.println("Enter id: ");
				int id = scanner.nextInt();
				cart.searchById(id);
				cartMenu();
				break;
			case 2:
				System.out.println("Enter title: ");
				String title = scanner.nextLine();
				title = scanner.nextLine();
				cart.searchByTitle(title);
				cartMenu();
				break;
			default:
				System.out.println("Please choose a valid number");
				cartMenu();
				break;
		}
	}


	public static void cartMenu2() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Sort by title");
		System.out.println("2. Sort by cost");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");

		int i = 0;
		try {
			i = scanner.nextInt();
		}
		catch(InputMismatchException exception) {
			System.out.println("Please choose a valid number");
			scanner.nextLine();
			cartMenu2();
			System.exit(0);
		}

		switch(i) {
			case 0:
				cartMenu();
				break;
			case 1:
				Collections.sort(cart.getItemsOrdered(), Media.COMPARE_BY_TITLE_COST);
				cart.print();
				cartMenu();
				break;
			case 2:
				Collections.sort(cart.getItemsOrdered(), Media.COMPARE_BY_COST_TITLE);
				cart.print();
				cartMenu();
				break;
			default:
				System.out.println("Please choose a valid number");
				cartMenu();
				break;
		}
	}


	public static void cartMenu3() {
		scanner.nextLine();
		System.out.println("Enter title: ");
		String title = scanner.nextLine();
		boolean flag = true;

		for (Media m: cart.getItemsOrdered()) {
			if (m.getTitle().equals(title)) {
				cart.removeMedia(m);
				System.out.println("Number of medias in cart: " + cart.getItemsOrdered().size());
				flag = false;
			}
		}
		if (flag) {
			System.out.println("No match is found");
		}
		cartMenu();
	}


	public static void cartMenu4() {
		scanner.nextLine();
		System.out.println("Enter title: ");
		String title = scanner.nextLine();
		boolean flag = true;

		for (Media m: cart.getItemsOrdered()) {
			if (m.getTitle().equals(title)) {
				if (m instanceof CompactDisc) {
					CompactDisc cd = (CompactDisc) m;
					cd.play();
				}
				else if (m instanceof DigitalVideoDisc) {
					DigitalVideoDisc dvd = (DigitalVideoDisc) m;
					dvd.play();
				}
				else if (m instanceof Book) {
					System.out.println("Cannot play");
				}
				flag = false;
			}
		}
		if (flag) {
			System.out.println("No match is found");
		}
		cartMenu();
	}


	public static void cartMenu5() {
		System.out.println("An order is created");
		cart.getItemsOrdered().clear();
	}

}
