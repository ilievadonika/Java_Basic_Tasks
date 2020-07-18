import java.util.Scanner;

public class ToyShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double puzzle = 2.6;
        double doll = 3;
        double teddyBear = 4.1;
        double minion = 8.2;
        double track = 2;

        double priceExcursion = Double.parseDouble(scanner.nextLine());
        int puzzlesQuantity = Integer.parseInt(scanner.nextLine());
        int dollsQuantity = Integer.parseInt(scanner.nextLine());
        int teddyBearQuantity = Integer.parseInt(scanner.nextLine());
        int minionQuantity = Integer.parseInt(scanner.nextLine());
        int trackQuantity = Integer.parseInt(scanner.nextLine());

        int toysQuantity = puzzlesQuantity
                + dollsQuantity
                + teddyBearQuantity
                + minionQuantity
                + trackQuantity;
        double priceWithoutDiscount = (puzzlesQuantity * puzzle)
                + (dollsQuantity * doll)
                + (teddyBearQuantity * teddyBear)
                + (minionQuantity * minion)
                + (trackQuantity * track);
        double priceAfterRent;
        double moneyLeft;

        if(toysQuantity >= 50) {

            double priceAfterDiscount = priceWithoutDiscount - priceWithoutDiscount * 0.25;
            priceAfterRent = priceAfterDiscount - priceAfterDiscount * 0.1;
        }else{
            priceAfterRent = priceWithoutDiscount - priceWithoutDiscount * 0.1;
        }

        if(priceAfterRent >= priceExcursion){
            moneyLeft = priceAfterRent - priceExcursion;
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        }else{
            moneyLeft = priceExcursion - priceAfterRent;
            System.out.printf("Not enough money! %.2f lv needed.", moneyLeft);
        }





    }
}
