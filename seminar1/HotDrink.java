package seminar1;

public class HotDrink extends Product{
       private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public HotDrink(String name, int cost, int temperature) {
        super(name, cost);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", cost=" + cost +","+" "+
                "temperature=" + temperature +
                '}';
    }
}




