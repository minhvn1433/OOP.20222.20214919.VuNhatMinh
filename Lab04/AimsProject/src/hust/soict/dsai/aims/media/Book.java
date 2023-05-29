package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class Book extends Media {
	
	private ArrayList<String> authors = new ArrayList<String>();

	
	public ArrayList<String> getAuthors() {
		return authors;
	}
	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}

	
	public Book(String title, String category, float cost, ArrayList<String> authors) {
		super(title, category, cost);
		this.authors = authors;
	}
	public Book(String title) {
		super(title);
	}
	public Book() {}

	
	public void addAuthor(String author) {
		if (!authors.contains(author)) {
			authors.add(author);
		}
	}
	
	
	public void removeAuthor(String author) {
		if (authors.contains(author)) {
			authors.remove(author);
		}
	}

	
	public String toString() {
		return String.format("%s - Title: %s - Category: %s  - Cost: %f",
		this.getClass(), this.getTitle(), this.getCategory(), this.getCost());
	}
}
