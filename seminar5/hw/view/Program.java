package seminar5.hw.view;

import seminar5.hw.model.Animal;
import seminar5.hw.model.Bird;
import seminar5.hw.model.Cat;
import seminar5.hw.model.Dog;
import seminar5.hw.service.Shelter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Shelter shelter = new Shelter<>();
        List<Animal>list = new ArrayList<>(Arrays.asList(
                new Cat("Барсик",2,"Сфинкс"),
                new Dog("Стрелка", 4,"Лайка"),
                new Bird("Чара",3,"кара")));
        shelter.shelter(list);

        System.out.println(shelter.presenceAnimal("Барсик",2," "));

    }
}
