import java.util.ArrayList;
import java.util.List;

public class HotDrinkMashine implements ProductMashine{

    List<HotDrink> listProduct = new ArrayList<HotDrink>();

    public void initProducts(List<HotDrink> listProd) {
        this.listProduct = listProd;
    }

    public Product getProduct(String name){
        for (Product prod : listProduct) {
            if (prod.getName().equals(name)) {
                return prod; 
            }
        }
        return null;
    }

    public HotDrink getProduct(String name, int temp, double cost) {
        for (HotDrink prod : listProduct) {
            if ((prod.getName().equals(name))&&(prod.getTemp()==temp)&&(prod.getCost()==cost)) {
                return prod; 
            }
        }
        return null;        
    }
}
