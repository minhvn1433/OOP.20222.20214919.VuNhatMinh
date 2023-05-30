package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();

	
	public String getArtist() {
		return artist;
	}


	public CompactDisc(String title, String category, float cost, String director, int length, String artist, ArrayList<Track> tracks) {
		super(title, category, cost, director, length);
		this.artist = artist;
		this.tracks = tracks;
	}
	public CompactDisc(String title, String category, float cost, String director, int length) {
		super(title, category, cost, director, length);
	}
	public CompactDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public CompactDisc(String title) {
		super(title);
	}
	public CompactDisc() {}


	public void addTrack(Track track) {
		if (tracks.contains(track)) {
			System.out.println("Track is already in the list of tracks");
		}
		else {
			tracks.add(track);
		}
	}

	
	public void removeTrack(Track track) {
		if (tracks.contains(track)) {
			tracks.remove(track);
		}
		else {
			System.out.println("Track is not existed in the list of tracks");
		}
	}
	
	
	public int getLength() {
		int length = 0;
		for (Track track: tracks) {
			length += track.getLength();
		}
		return length;
	}


	public void play() {
		for (Track track: tracks) {
			track.play();
		}
	}
	

	public String toString() {
		return String.format("CD - Title: %s - Category: %s - Cost: %f - Director %s - Length: %d - Artist: %s",
		this.getTitle(), this.getCategory(), this.getCost(), this.getDirector(), this.getLength(), this.getArtist());
	}

}
