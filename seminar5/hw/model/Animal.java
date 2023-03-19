package seminar5.hw.model;

public class Animal {
    private String naim;
    private Integer age;
    private String breed;

    public String getNaim() {
        return naim;
    }

    public void setNaim(String naim) {
        this.naim = naim;
    }

    public Integer getAdg() {
        return age;
    }

    public void setAdg(Integer adg) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Animal(String naim, Integer adg, String breed) {
        this.naim = naim;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "naim='" + naim + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}
