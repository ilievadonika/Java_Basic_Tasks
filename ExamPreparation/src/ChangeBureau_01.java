import java.util.Scanner;

public class ChangeBureau_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoinNumber = Integer.parseInt(scanner.nextLine());
        double chineseMoneyNumber = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double bitcoinToLev = bitcoinNumber * 1168;
        double chineseToDollar = chineseMoneyNumber * 0.15;
        double dollarToLev = chineseToDollar * 1.76;
        double levToEuro = bitcoinToLev / 1.95 + dollarToLev / 1.95;
        double commissionPercent = commission / 100;

        double totalAfterCommission = levToEuro - levToEuro * commissionPercent;

        System.out.printf("%.2f", totalAfterCommission);

    }
}
