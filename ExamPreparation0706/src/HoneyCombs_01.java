import java.util.Scanner;

public class HoneyCombs_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberBees = Integer.parseInt(scanner.nextLine());
        int numberFlowers = Integer.parseInt(scanner.nextLine());

        double production = numberBees * numberFlowers * 0.21;
        double numberFilledHoneyCombs = Math.floor(production / 100);
        double honeyLeft = production % 100;

        System.out.printf("%.0f honeycombs filled.%n",numberFilledHoneyCombs );
        System.out.printf("%.2f grams of honey left.", honeyLeft);

    }
}
