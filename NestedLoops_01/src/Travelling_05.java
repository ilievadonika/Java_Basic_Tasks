import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();

        while (!destination.equals("End")){
            double minBudget = Double.parseDouble(scanner.nextLine());
            while (minBudget > 0){
                double savings = Double.parseDouble(scanner.nextLine());
                minBudget -= savings;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}
