import java.util.Scanner;

public class EnergyBooster_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String setSize = scanner.nextLine();
        int countSet = Integer.parseInt(scanner.nextLine());
        double discount = 0;
        double sum = 0;

        switch (fruit){
            case "Watermelon":
                if(setSize.equals("small")){
                    sum = countSet * 2 * 56;
                }else if(setSize.equals("big")) {
                    sum = countSet * 5 * 28.70;
                }
                break;
            case "Mango":
                if(setSize.equals("small")){
                    sum = countSet * 2 * 36.66;
                }else if(setSize.equals("big")) {
                    sum = countSet * 5 * 19.60;
                }
                break;
            case "Pineapple":
                if(setSize.equals("small")){
                    sum = countSet * 2 * 42.10;
                }else if(setSize.equals("big")) {
                    sum = countSet * 5 * 24.80;
                }
                break;
            case "Raspberry":
                if(setSize.equals("small")){
                    sum = countSet * 2 * 20;
                }else if(setSize.equals("big")) {
                    sum = countSet * 5 * 15.20;
                }
                break;
        }
        if(sum >= 400 && sum <= 1000){
            discount = sum - sum * 0.15;
        }else if(sum > 1000){
            discount = sum - sum * 0.5;
        }else {
            discount = sum;
        }

        System.out.printf("%.2f lv.", discount);
    }
}
