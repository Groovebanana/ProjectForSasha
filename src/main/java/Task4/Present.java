package Task4;

import java.util.ArrayList;

public class Present {

    private ArrayList<Sweet> sweets;

    public Present() {
        sweets = new ArrayList<>();
    }

    public void addSweet(Sweet sweet) {
        sweets.add(sweet);
    }

    public void showSumWeightInfo() {
        double weight = 0;
        for (Sweet s : sweets) {
            weight += s.getWeight();
        }

        System.out.printf("\nОбщий вес подарка = %.2f г.\n", weight);
    }

    public void showSumPriceInfo() {
        double price = 0;
        for (Sweet s : sweets) {
            price += s.getPrice();
        }

        System.out.printf("\nОбщая цена подарка = %.2f ₽\n", price);
    }

    public void showSweetsInfo() {
        System.out.println("Информация по сладостям в подарке: ");
        for (Sweet s : sweets) {
            System.out.println(s.getSweetInfo());
        }
    }



}
