package hust.soict.dsai.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Polymorphism {
    public static void main(String[] args){
        List<Media> mediae = new ArrayList<Media>();
        
        
        // create some media here
        // for example: cd, dvd, book
        CompactDisc cd = new CompactDisc();
        DigitalVideoDisc dvd = new DigitalVideoDisc();
        Book b = new Book();
        
        mediae.add(cd);
        mediae.add(dvd);
        mediae.add(b);
        for (Media m : mediae) {
            System.out.println(m.toString());
        }
    }
}