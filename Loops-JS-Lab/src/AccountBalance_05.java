import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //scan
        //amountOfDeposits -> Колко вноски очакваме
        //currentDeposit = 1
        //sum= 0;
        //While currentDeposit <= amountOfDeposits
            //double income -> console
            //sum = sum + income
            //currentDeposit++
        int amountOfDeposits = Integer.parseInt(scanner.nextLine());
        int currentDeposit = 1;
        double sum = 0;

        while(currentDeposit <= amountOfDeposits){
            double income = Double.parseDouble(scanner.nextLine());
            if(income < 0){
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f %n", income);
            sum = sum + income;
            currentDeposit++;
        }
        System.out.printf("Total: %.2f", sum);
    }
}
