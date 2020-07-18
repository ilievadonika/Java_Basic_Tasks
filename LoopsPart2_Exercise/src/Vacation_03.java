import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double needMoney = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());
        int countAllDays = 0;
        int countSpendDays = 0;

        while (money < needMoney) {
            String action = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());
            countAllDays++;
            if (action.equals("save")) {
                money += price;
                countSpendDays = 0;
            } else if (action.equals("spend")) {
                money -= price;
                countSpendDays++;
                if (money < 0) {
                    money = 0;
                }
            }
            if(countSpendDays == 5){
                System.out.println("You can't save the money.");
                System.out.println(countAllDays);
                break;
            }
        }
        if (money >= needMoney) {
            System.out.printf("You saved the money for %d days.", countAllDays);
        }
    }
}
