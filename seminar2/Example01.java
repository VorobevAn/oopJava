package seminar2;

public class Example01 {
    public static void main(String[] args) {

        Human hm = new Human();
        hm.name = "Владимир";
        Human hm2 = new Human();
        hm2.name = "Иван";

        Market market = new Market();

        market.acceptToMarket(hm);
        market.acceptToMarket(hm2);

        market.takeInQueue(hm);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(hm);
        market.takeInQueue(hm2);


    }
}
