import java.util.Scanner;

public class SkiTrip_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysVacation = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String mark = scanner.nextLine();

        int nights = daysVacation - 1;
        double priceOfVacation = 0;

        switch (roomType){
            case "room for one person" :
                priceOfVacation = nights * 18;
                break;
            case "apartment" :
                priceOfVacation = nights * 25;
                if(nights < 10){
                    priceOfVacation = priceOfVacation * 0.7;
                }else if(nights >= 10 && nights <= 15){
                    priceOfVacation = priceOfVacation * 0.65;
                }else if(nights > 15){
                    priceOfVacation = priceOfVacation * 0.5;
                }
                break;
            case "president apartment" :
                priceOfVacation = nights * 35;
                if(nights < 10){
                    priceOfVacation = priceOfVacation * 0.9;
                }else if(nights >= 10 && nights <= 15){
                    priceOfVacation = priceOfVacation * 0.85;
                }else if(nights > 15){
                    priceOfVacation = priceOfVacation * 0.8;
                }
                break;
        }

        if(mark.equals("positive")){
            priceOfVacation = priceOfVacation + priceOfVacation * 0.25;
            System.out.printf("%.2f", priceOfVacation);
        }else {
            priceOfVacation = priceOfVacation - priceOfVacation * 0.1;
            System.out.printf("%.2f", priceOfVacation);
        }

    }
}
