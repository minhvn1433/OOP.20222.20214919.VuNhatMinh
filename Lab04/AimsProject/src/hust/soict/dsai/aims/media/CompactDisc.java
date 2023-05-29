package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
	
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();

	
	public String getArtist() {
		return artist;
	}


	public CompactDisc(String title, String category, float cost, int length, String director, String artist) {
		super(title, category, cost, length, director);
		this.artist = artist;
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

}
