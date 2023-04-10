package sem1;

public class Bread extends Product {

    private double calories;
    public Bread(String name, double price, int value, double calories) {
        super(name, price, value);
        this.calories = calories;
    }

    @Override
    public String toString() {
        return String.format("Хлеб : %s, калорийность : %f" ,super.toString(), calories);
    }
}
