import java.util.Scanner;

public class FruitShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        boolean workingDays = dayOfTheWeek.equals("Monday")
                            || dayOfTheWeek.equals("Tuesday")
                            || dayOfTheWeek.equals("Wednesday")
                            || dayOfTheWeek.equals("Thursday")
                            || dayOfTheWeek.equals("Friday");
        boolean dayOff = dayOfTheWeek.equals("Saturday") || dayOfTheWeek.equals("Sunday");
        double price = 0;

        switch (fruit){
            case "banana" :
                if(dayOff){
                    price = quantity * 2.7;
                }else if(workingDays) {
                    price = quantity * 2.5;
                }
                break;
            case "apple" :
                if(dayOff){
                    price = quantity * 1.25;
                }else if(workingDays){
                    price = quantity * 1.20;
                }
               break;
            case "orange" :
                if(dayOff){
                    price = quantity * 0.9;
                }else if(workingDays){
                    price = quantity * 0.85;
                }
                break;
            case "grapefruit" :
                if(dayOff){
                    price = quantity * 1.60;
                }else if(workingDays){
                    price = quantity * 1.45;
                }
                break;
            case "kiwi" :
                if(dayOff){
                    price = quantity * 3;
                }else if(workingDays){
                    price = quantity * 2.7;
                }
                break;
            case "pineapple" :
                if(dayOff){
                    price = quantity * 5.6;
                }else if(workingDays){
                    price = quantity * 5.5;
                }
                break;
            case "grapes" :
                if(dayOff){
                    price = quantity * 4.20;
                }else if(workingDays){
                    price = quantity * 3.85;
                }
                break;

        }
        if(price != 0){
        System.out.printf("%.2f", price);
        }else {
            System.out.printf("error");
        }

    }
}
