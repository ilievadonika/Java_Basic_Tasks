import java.util.Scanner;

public class FishingBoat_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int countPeople = Integer.parseInt(scanner.nextLine());

        int rent = 0;
        double discount = 0;
        //Цената зависи от сезона:
        //•	Цената за наем на кораба през пролетта е  3000 лв.
        //•	Цената за наем на кораба през лятото и есента е  4200 лв.
        //•	Цената за наем на кораба през зимата е  2600 лв.
        //В зависимост от броя си групата ползва отстъпка:
        //•	Ако групата е до 6 човека включително  –  отстъпка от 10%.
        //•	Ако групата е от 7 до 11 човека включително  –  отстъпка от 15%.
        //•	Ако групата е от 12 нагоре  –  отстъпка от 25%.
        //Рибарите ползват допълнително 5% отстъпка ако са четен брой освен ако не е есен - тогава нямат допълнителна отстъпка.

        double total;
        double moneyLeft;
        double needMoney;

        switch (season){
            case "Spring" :
                rent = 3000;
                if(countPeople <= 6){
                    discount = 0.10;
                }else if(countPeople <= 11){
                    discount = 0.15;
                }else {
                    discount = 0.25;
                }
                break;
            case "Summer" :
            case "Autumn" :
                rent = 4200;
                if(countPeople <= 6){
                    discount = 0.10;
                }else if(countPeople <= 11){
                    discount = 0.15;
                }else {
                    discount = 0.25;
                }
                break;
            case "Winter" :
                rent = 2600;
                if(countPeople <= 6){
                    discount = 0.10;
                }else if(countPeople <= 11){
                    discount = 0.15;
                }else {
                    discount = 0.25;
                }
                break;
        }
        if(countPeople % 2 == 0 && !season.equals("Autumn")){
            total = rent - rent * discount;
            double totalAfterBonusDiscount = total - total * 0.05;
            moneyLeft = budget - totalAfterBonusDiscount;
            needMoney = totalAfterBonusDiscount - budget;

            if(budget >= totalAfterBonusDiscount) {
                System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
            }else {
                System.out.printf("Not enough money! You need %.2f leva.", needMoney);
            }
        }else {
            total = rent - rent * discount;
            moneyLeft = budget - total;
            needMoney = total - budget;
            if(budget >= total) {
                System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
            }else {
                System.out.printf("Not enough money! You need %.2f leva.", needMoney);
            }
        }


        }
}
