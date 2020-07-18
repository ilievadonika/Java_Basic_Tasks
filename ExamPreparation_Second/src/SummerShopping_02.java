import java.util.Scanner;

public class SummerShopping_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        double priceTowel = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double priceUmbrella = priceTowel * (2.0/3.0);
        double priceFlipFlops = priceUmbrella * 0.75;
        double priceBeachBag = (1.0/3.0) * (priceTowel + priceFlipFlops);

        double sum = priceTowel + priceUmbrella + priceFlipFlops + priceBeachBag;
        double sumWithDiscount = sum - sum * (percentDiscount / 100.00);
        double moneyLeft = budget - sumWithDiscount;
        double moneyNeed = sumWithDiscount - budget;

        if(budget >= sumWithDiscount) {
            System.out.printf("Annie's sum is %.2f lv. She has %.2f lv. left.", sumWithDiscount, moneyLeft);
        }else {
            System.out.printf("Annie's sum is %.2f lv. She needs %.2f lv. more.", sumWithDiscount, moneyNeed);
        }
    }
}
