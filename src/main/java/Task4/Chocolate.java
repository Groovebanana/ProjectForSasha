package Task4;

public class Chocolate extends Sweet {

    private double darknessLevel;

    public Chocolate(String name, double weight, double price, double darknessLevel) {
        super(name, weight, price);
        this.darknessLevel = darknessLevel;

    }

    public double getDarknessLevel() {
        return darknessLevel;
    }

    @Override
    public String getSweetInfo() {
        return String.format("Название шоколада: %s; Вес шоколада: %.2f; Цена шоколада: %.2f; Горечь шоколада: %s\n", getName(), getWeight(), getPrice(), getDarknessLevel());

    }
}
