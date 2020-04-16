package Task4;

public class Jellybean extends Sweet {

    private int hardnessIndex;

    public Jellybean(String name, double weight, double price, int hardnessIndex) {
        super(name, weight, price);
        this.hardnessIndex = hardnessIndex;
    }

    public int getHardnessIndex() {
        return hardnessIndex;
    }

    @Override
    public void ShowSweetInfo() {
        System.out.printf("Название жевательной конфеты: %s; Вес жевательной конфеты: %.2f; Цена жевательной конфеты: %.2f; Твердость жевательной конфеты: %d\n", getName(), getWeight(), getPrice(), getHardnessIndex());
    }
}
