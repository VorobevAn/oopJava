package seminar5.hw.service;

import seminar5.hw.model.Animal;

import java.util.ArrayList;
import java.util.List;

public class Shelter <T extends Animal>{
    private List <T> animal = new ArrayList<>();
    public void shelter (List<T> animal) {
        this.animal = animal;
    }
    public Animal presenceAnimal(String naim, Integer age, String breed){
        for(T p:animal ){
            if(p.getNaim().equalsIgnoreCase(naim)||p.getBreed().equalsIgnoreCase(breed)){
                return p;
            }
        }
        return new Animal("такого животного нет",0," ");
    }
}
