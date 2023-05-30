package hust.soict.dsai.aims.media;
import java.util.Comparator;

public abstract class Media {
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	private int id;
	private String title;
	private String category;
	private float cost;
	private static int nbMedias = 0;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}

	
	public Media(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbMedias += 1;
		this.id = nbMedias;
	}
	public Media(String title) {
		this.title = title;
		nbMedias += 1;
		this.id = nbMedias;
	}
	public Media() {
		nbMedias += 1;
		this.id = nbMedias;
	}


	@Override
	public boolean equals(Object o) {
		if (o instanceof Media) {
			Media m = (Media) o;
			if (this.title == m.getTitle()) {
				return true;
			}
		}
		return false;
	}

}
