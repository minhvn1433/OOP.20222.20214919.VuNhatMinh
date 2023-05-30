package hust.soict.dsai.aims.media;
import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        int t = m1.getTitle().compareTo(m2.getTitle());
        if (t != 0) {
            return t;
        }
        return Double.compare(m1.getCost(), m2.getCost());
    }
}
