package seminar3.hw;

import java.util.Comparator;

public class ComporatorCat implements Comparator <Cat>{
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getYears().compareTo(o2.getYears());
    }

}
