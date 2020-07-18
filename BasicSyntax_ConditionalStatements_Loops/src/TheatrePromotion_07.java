import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int price = 0;

        if(dayType.equals("Weekday")){
            if(age >= 0 && age <= 18){
                price = 12;
            }else if(age > 18 && age <= 64){
                price = 18;
            }else if(age > 64 && age <= 122){
                price = 12;
            }
        }else if(dayType.equals("Weekend")){
            if(age >= 0 && age <= 18){
                price = 15;
            }else if(age > 18 && age <= 64){
                price = 20;
            }else if(age > 64 && age <= 122){
                price = 15;
            }
        }else if(dayType.equals("Holiday")){
            if(age >= 0 && age <= 18){
                price = 5;
            }else if(age > 18 && age <= 64){
                price = 12;
            }else if(age > 64 && age <= 122){
                price = 10;
            }
        }

        if(price == 0){
            System.out.println("Error!");
        } else {
            System.out.println(price + "$");
        }
    }
}
