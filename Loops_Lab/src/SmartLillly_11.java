import java.util.Scanner;

public class SmartLillly_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lillyAge = Integer.parseInt(scanner.nextLine());
        double priceWM = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());

        int money = 0;
        int brotherMoney = 0;
        int sumToysMoney = 0;
        //even birthdays - money (10lv + )
        //odd birthdays - toys
        for(int i = 1; i <= lillyAge; i++){
            if(i % 2 == 0){
                money = money + 10 * (i/2);
                brotherMoney = brotherMoney + 1;
            }else {
                sumToysMoney = sumToysMoney + pricePerToy;
            }
        }

        int total = (money - brotherMoney) + sumToysMoney;
        if(total >= priceWM){
            double moneyLeft = total - priceWM;
            System.out.printf("Yes! %.2f", moneyLeft);
        }else {
            double needMoney = priceWM - total;
            System.out.printf("No! %.2f", needMoney);
        }
    }
}
