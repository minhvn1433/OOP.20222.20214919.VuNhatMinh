package hust.soict.dsai.aims.media;
import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        int c = Float.compare(m2.getCost(), m1.getCost());
        if (c != 0) {
            return c;
        }
        return m1.getTitle().compareTo(m2.getTitle());
    }
}
