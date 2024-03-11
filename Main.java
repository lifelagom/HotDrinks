import java.util.List;

public class Main {

    public static void main(String[] args){
        HotDrink prod1 = new HotDrink("Кофе", 27, 3.0);
        HotDrink prod2 = new HotDrink("Чай", 30, 2.0);
        HotDrink prod3 = new HotDrink("Какао", 24, 3.0);
        HotDrink prod4 = new HotDrink("Латте", 27, 4.0);
        
        HotDrinkMashine prodAuto = new HotDrinkMashine();

        prodAuto.initProducts(List.of(prod1,prod2,prod3,prod4));
        // System.out.println(prodAuto.getList());
        System.out.println(prodAuto.getProduct("Какао", 24, 2.0));
        System.out.println(prodAuto.getProduct("Чай", 19, 2.0));
        System.out.println(prodAuto.getProduct("Кофе", 27, 3.0));
    }
}
