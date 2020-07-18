import java.util.Scanner;

public class Savings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salary = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        double expense = Double.parseDouble(scanner.nextLine());

        double unexpectedExpense = salary * 0.3;
        double savingsPerMonth = salary - expense - unexpectedExpense;
        double expectedSavings = days * savingsPerMonth;
        double percentSavings = (savingsPerMonth / salary) * 100;

        System.out.printf("She can save %.2f%%%n", percentSavings);
        System.out.printf("%.2f", expectedSavings);
    }
}
