package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
	
	public DigitalVideoDisc(String title, String category, float cost, String director, int length) {
		super(title, category, cost, director, length);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public DigitalVideoDisc(String title) {
		super(title);
	}
	public DigitalVideoDisc() {}
	
	
	public boolean search(String title) {
		String keywords[] = title.toLowerCase().split(" ");
		for (String word: keywords) {
			if (this.getTitle().toLowerCase().contains(word)) {
				return true;
			}
		}
		return false;
	}


	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	

	public String toString() {
		return String.format("DVD - Title: %s - Category: %s - Cost: %f - Director: %s - Length: %d",
		this.getTitle(), this.getCategory(), this.getCost(), this.getDirector(), this.getLength());
	}

}
