import java.util.List;

public interface ProductMashine {
    public void initProducts(List<HotDrink> listProd);
    public Product getProduct(String name);

//     public List<Product> getList() {
//         return listProduct;
//     }
}
