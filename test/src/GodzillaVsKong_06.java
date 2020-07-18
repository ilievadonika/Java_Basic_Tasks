import java.util.Scanner;

public class GodzillaVsKong_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countStatists = Integer.parseInt(scanner.nextLine());
        double pricePerStatist = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.1;
        double clothesPrice = countStatists * pricePerStatist;

        if(countStatists > 150){
            clothesPrice = clothesPrice - clothesPrice * 0.1;
        }

        double total = decorPrice + clothesPrice;

        if(total > budget){
            double moneyNeed = total - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyNeed);
        }else {
            double moneyLeft = budget - total;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
        }
    }
}
