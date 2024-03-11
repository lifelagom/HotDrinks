public class HotDrink extends Product{

    protected int temp;

    public HotDrink(String name, int temp, double cost) {
        this.name = name;
        this.temp = temp;
        this.cost = cost;
    }

    public int getTemp() {
        return temp;
    }

    @Override

    public String toString() {
        return String.format("Товар: %s, Температура: %d, Цена: %2f", name, temp, cost);
    }

}
