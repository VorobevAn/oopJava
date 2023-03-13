package seminar3.hw;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>(Arrays.asList(
                new Cat("barsik", 3),
                new Cat("murzik", 4),
                new Cat("Pushoc", 1),
                new Cat("Vasiliy", 5)));
        Iterator<Cat> cat = cats.iterator();
        while (cat.hasNext()) {
            System.out.println(cat.next());
        }
        System.out.println("Не сортированный: " + cats);
        Comparator<Cat> ageComp = new ComporatorCat();
        cats.sort(ageComp);
        System.out.println("Отсартирован по годам: " + cats);
        }
    }





