package Task4;

public class Candy extends Sweet{

    private String shape;


    public Candy(String name, double weight, double price, String shape) {
        super(name, weight, price);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    @Override
    public String getSweetInfo() {
        return String.format("Название конфеты: %s; Вес конфеты: %.2f; Цена конфеты: %.2f; Форма конфеты: %s\n", getName(), getWeight(), getPrice(), getShape());
    }
}
