package seminar1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine extends VendingMachine {
    List<HotDrink> hotDrinks = new ArrayList<>();

    void initProduct(List<HotDrink> hotBeverages) {
        this.hotDrinks = hotBeverages;
    }

    @Override
    public HotDrink getProduct(String name,int cost, int temperature) {
        for(HotDrink el: hotDrinks) {
            if (el.getName().equals(name) && el.getCost() == cost && el.getTemperature()== temperature) {
                return el;
            }
        }
        return new HotDrink("Товар не найден",0,0);
    }
}