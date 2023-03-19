package seminar4;

import seminar1.HotDrink;

import java.util.ArrayList;
import java.util.List;

public  class VendingMachine<T extends Products> {
    private List<T> products = new ArrayList<>();
    public void  intProduct(List<T> products){
        this.products = products;
    }
    public T getProduct(String name,int cost, int temperature){
         for (T p: products){
            if (p.getName().equalsIgnoreCase(name)){
                return  p;
            }
        }
        return (T) new Products("Нет продукта",0);
    }


}
