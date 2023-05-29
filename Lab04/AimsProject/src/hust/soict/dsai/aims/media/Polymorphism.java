package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Polymorphism {
    public static void main(String[] args){
        List<Media> mediae = new ArrayList<>();
        
        
        // create some media here
        // for example: cd, dvd, book
        CompactDisc cd = new CompactDisc();
        DigitalVideoDisc dvd = new DigitalVideoDisc();
        Book book = new Book();
        
        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(book);
        Track track = new Track("Orange - Shigatsu Wa Kimi No Uso", 6);
        cd.addTrack(track);
        
        for (Media m :mediae){
            System.out.println(m.toString());
        }
    }
}