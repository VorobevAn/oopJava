package seminar4;


public class HotDrinks extends Products {
    private int temperature;
    public HotDrinks(String name, int cost, int temperature) {
        super(name, cost);
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }



    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() + "," + " " +
                "temperature=" + temperature +
                '}';
    }



}


