package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;

public class Store {

	private ArrayList<Media> itemsInStore = new ArrayList<Media>();


	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}
	

	public void addMedia(Media media) {
		if (!itemsInStore.contains(media)) {
			itemsInStore.add(media);
		}
	}


	public void removeMedia(Media media) {
		if(itemsInStore.contains(media)) {
			itemsInStore.remove(media);
		}
	}


	public void print() {
		System.out.println("**********************STORE***********************");
		System.out.println("Items In Store:");
		for (Media m: itemsInStore) {
			System.out.println(m.toString());
		}
		System.out.println("***************************************************");
	}
}
