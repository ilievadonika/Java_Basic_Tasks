import java.util.Scanner;

public class CruiseShip_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfCruise = scanner.nextLine();
        String typeCabin = scanner.nextLine();
        int numberNights = Integer.parseInt(scanner.nextLine());

        double pricePerNight = 0;
        double sumOFVacation = 0;
        double sumOFVacationDiscount = 0;

        switch (typeOfCruise){
            case "Mediterranean":
                if(typeCabin.equals("standard cabin")){
                    pricePerNight = 27.5;
                }else if(typeCabin.equals("cabin with balcony")){
                    pricePerNight = 30.2;
                }else if(typeCabin.equals("apartment")){
                    pricePerNight = 40.50;
                }
                break;
            case "Adriatic":
                if(typeCabin.equals("standard cabin")){
                    pricePerNight = 22.99;
                }else if(typeCabin.equals("cabin with balcony")){
                    pricePerNight = 25;
                }else if(typeCabin.equals("apartment")){
                    pricePerNight = 34.99;
                }
                break;
            case "Aegean":
                if(typeCabin.equals("standard cabin")){
                    pricePerNight = 23;
                }else if(typeCabin.equals("cabin with balcony")){
                    pricePerNight = 26.60;
                }else if(typeCabin.equals("apartment")){
                    pricePerNight = 39.80;
                }
                break;
        }
        if(numberNights > 7){
            sumOFVacation = 4 * numberNights * pricePerNight;
            sumOFVacationDiscount = sumOFVacation - sumOFVacation * 0.25;
            System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", typeOfCruise, sumOFVacationDiscount);
        }else {
            sumOFVacation = 4 * numberNights * pricePerNight;
            System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", typeOfCruise, sumOFVacation);
        }

    }
}
