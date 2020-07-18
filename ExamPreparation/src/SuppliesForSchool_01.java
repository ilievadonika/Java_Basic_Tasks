import java.util.Scanner;

public class SuppliesForSchool_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPens = Integer.parseInt(scanner.nextLine());
        int countMarkers = Integer.parseInt(scanner.nextLine());
        double countWasher = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double totalSum = countPens * 5.8 + countMarkers * 7.2 + countWasher * 1.2;
        double sumWithDiscount = totalSum - totalSum * (percentDiscount * 1.0 / 100);

        System.out.printf("%.3f", sumWithDiscount);
    }
}
