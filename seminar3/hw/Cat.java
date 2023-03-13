package seminar3.hw;

import java.util.Comparator;

public class Cat {
    private String name;
    private Integer years;


    public Cat(String name, int years) {
        this.name = name;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYears() {
        return years;
    }

    @Override
    public String toString() {
        return "\nCat{" +
                "name='" + name + '\'' +
                ", years=" + years +
                '}';
    }

    public void setYears(Integer years) {
        this.years = years;
    }




}