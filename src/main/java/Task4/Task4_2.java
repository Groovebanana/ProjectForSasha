package Task4;

public class Task4_2 {

    public static void start() {
        Present present = new Present();
        present.addSweet(new Candy("Fererro Rocher", 10, 50, "round"));
        present.addSweet(new Jellybean("Gummy bear", 10, 30, 3));
        present.addSweet(new Chocolate("Alyonka", 40, 100, 3));
        present.addSweet(new Chocolate("Alpen Gold", 30, 80, 1));

        present.showSumWeightInfo();
        present.showSumPriceInfo();
        present.showSweetsInfo();
    }
}
