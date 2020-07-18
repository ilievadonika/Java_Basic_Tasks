import java.util.Scanner;

public class Journey_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        double priceHoliday = 0;
        String place = "";
        //•	При 100лв. или по-малко – някъде в България
        //o	Лято – 30% от бюджета
        //o	Зима – 70% от бюджета
        //•	При 1000лв. или по малко – някъде на Балканите
        //o	Лято – 40% от бюджета
        //o	Зима – 80% от бюджета
        //•	При повече от 1000лв. – някъде из Европа
        //o	При пътуване из Европа, независимо от сезона ще похарчи 90% от бюджета.

        if(budget <= 100){
            destination = "Bulgaria";
            if(season.equals("summer")){
                priceHoliday = budget * 0.3;
                place = "Camp";
            }else if(season.equals("winter")){
                priceHoliday = budget * 0.7;
                place = "Hotel";
            }
        }else if(budget <= 1000){
            destination = "Balkans";
            if(season.equals("summer")){
                priceHoliday = budget * 0.4;
                place = "Camp";
            }else if(season.equals("winter")){
                priceHoliday = budget * 0.8;
                place = "Hotel";
            }
        }else if(budget > 1000){
            destination = "Europe";
            priceHoliday = 0.9 * budget;
            place = "Hotel";
            }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", place, priceHoliday);
    }
}
