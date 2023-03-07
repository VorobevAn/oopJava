package seminar1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        List<Product> products = new ArrayList<>(Arrays.asList
                (new Product("pepsi",42),
                new Product("chocolate",67),
                new Product("pepsi",50),
                new Product("cola",70)));
        vendingMachine.intProduct(products);
        System.out.println(vendingMachine.getProduct("cola",0,0));

        HotDrinksVendingMachine hotDrinksVendingMachine = new HotDrinksVendingMachine();
        List<HotDrink> hotDrinks = new ArrayList<>(Arrays.asList(
                new HotDrink("кофе",75,90),
                new HotDrink("гринтвеин",150,92),
                new HotDrink("чай",20,95)));
        hotDrinksVendingMachine.initProduct(hotDrinks);
        System.out.println(hotDrinksVendingMachine.getProduct("гринтвеин",150,92));


    }

}
