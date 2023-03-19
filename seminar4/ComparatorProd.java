package seminar4;

import java.util.Comparator;

public class ComparatorProd<T extends Products> implements Comparator<T> {

    @Override
    public int compare(T o1,T o2) {
       return Integer.compare(o1.getCost(), o2.getCost());
    }
}
