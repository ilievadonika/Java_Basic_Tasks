import java.util.Scanner;

public class FitnessCard_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double myMoney = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int years = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double cardPrice = 0;

        if(gender.equals("m")) {
            switch (sport) {
                case "Gym":
                    cardPrice = 42;
                    break;
                case "Boxing":
                    cardPrice = 41;
                    break;
                case "Yoga":
                    cardPrice = 45;
                    break;
                case "Zumba":
                    cardPrice = 34;
                    break;
                case "Dances":
                    cardPrice = 51;
                    break;
                case "Pilates":
                    cardPrice = 39;
                    break;
            }
        }else if(gender.equals("f")) {
                switch (sport) {
                    case "Gym":
                        cardPrice = 35;
                        break;
                    case "Boxing":
                    case "Pilates":
                        cardPrice = 37;
                        break;
                    case "Yoga":
                        cardPrice = 42;
                        break;
                    case "Zumba":
                        cardPrice = 31;
                        break;
                    case "Dances":
                        cardPrice = 53;
                        break;
                }
            }
        if(years <= 19){
            cardPrice = cardPrice - cardPrice * 0.2;
        }
        if(myMoney >= cardPrice){
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        }else{
            double needMoney = cardPrice - myMoney;
            System.out.printf("You don't have enough money! You need $%.2f more.", needMoney);
        }
    }
}
