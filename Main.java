import java.util.List;

public class Main {

    public static void main(String[] args){
        Product prod1 = new BottleOfWater("Квас", 1.0);
        Product prod2 = new BottleOfWater("Кефир", 2.0);
        Product prod3 = new BottleOfWater("Простокваша", 3.0);
        Product prod4 = new BottleOfWater("Сок", 4.0);
        
        ProductMashineBottle prodAuto = new ProductMashineBottle();

        prodAuto.initProducts(List.of(prod1,prod2,prod3,prod4));
        // System.out.println(prodAuto.getList());
        System.out.println(prodAuto.getProduct("Простокваша"));
    }
}
