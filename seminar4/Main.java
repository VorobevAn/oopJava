package seminar4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        VendingMachine<Products> vendingMachine = new VendingMachine<>();
        List<Products> products = new ArrayList<>(Arrays.asList
                (new Products("pepsi",42),
                new Products("chocolate",67),
                new Products("pepsi",50),
                new Products("cola",70)));
        vendingMachine.intProduct(products);
        System.out.println("Искомый продукт: "+vendingMachine.getProduct("cola",70,50));
        System.out.println("Отсортированный список");
        Comparator<Products> compar = new ComparatorProd<>();
        products.sort(compar);
        for (Products p:products) {
            System.out.println(p);
        }

        System.out.println("--------------------------");
        VendingMachine<HotDrinks> vendingMachine1 = new VendingMachine<>();
        List<HotDrinks> drink = new ArrayList<>(Arrays.asList(
                new HotDrinks("кофе",75,90),
                new HotDrinks("гринтвеин",150,92),
                new HotDrinks("чай",20,95)));
        vendingMachine1.intProduct(drink);
        System.out.println("Искомый продукт: "+ vendingMachine1.getProduct("кофе",75,90));

        Comparator<HotDrinks> Dtings = new ComparatorProd<>();
        drink.sort(Dtings);
        for(HotDrinks drinks: drink){
            System.out.println(drinks);
        }



    }

}
