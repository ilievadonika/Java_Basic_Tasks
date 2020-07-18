import java.util.Scanner;

public class Task6YeardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerMeter = 7.61;
        double gardenSize = Double.parseDouble(scanner.nextLine());
        double price = pricePerMeter * gardenSize;
        double discount = price * 0.18;
        double finalPrice = price - discount;

        System.out.printf("The final price is: %.2f lv. %n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
