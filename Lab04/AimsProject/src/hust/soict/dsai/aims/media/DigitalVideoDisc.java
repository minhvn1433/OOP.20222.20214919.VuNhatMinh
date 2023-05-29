package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media implements Playable {
	
	private String director;
	private int length;
	
	
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}


	public DigitalVideoDisc(String title, String category, float cost, String director, int length) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
	public DigitalVideoDisc(String title) {
		super(title);
	}
	public DigitalVideoDisc() {}


	public String getDetail() {
		return String.format("%d. DVD - %s - %s - %s - %d: %f $",
		this.getId(), this.getTitle(), this.getCategory(), this.getDirector(), this.getLength(), this.getCost());
	}	
	
	
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

}
