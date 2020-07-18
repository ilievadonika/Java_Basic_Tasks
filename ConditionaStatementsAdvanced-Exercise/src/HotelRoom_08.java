import java.util.Scanner;

public class HotelRoom_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int countNights = Integer.parseInt(scanner.nextLine());

        double priceForStudio = 0;
        double priceForApartment = 0;

        //•	За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
        //•	За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
        //•	За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
        //•	За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.

        if(month.equals("May") || month.equals("October")){
            if(countNights <= 7){
                priceForStudio = 50;
                priceForApartment = 65;
            }else if(countNights > 7 && countNights <= 14) {
                priceForStudio = 50 * 0.95;
                priceForApartment = 65;
            }else if(countNights > 14) {
                priceForStudio = 50 * 0.70;
                priceForApartment = 65 * 0.90;
            }
        }else if(month.equals("June") || month.equals("September")){
            if(countNights <= 14){
                priceForStudio = 75.20;
                priceForApartment = 68.70;
            }else if(countNights > 14) {
                priceForStudio = 75.20 * 0.8;
                priceForApartment = 68.70 * 0.9;
            }
        }else if(month.equals("July") || month.equals("August")){
            if(countNights <= 14) {
                priceForStudio = 76;
                priceForApartment = 77;
            }else if(countNights > 14){
                priceForStudio = 76;
                priceForApartment = 77 * 0.9;
            }
        }

        double totalPriceApartment = priceForApartment * countNights;
        double totalPriceStudio = priceForStudio * countNights;
        System.out.printf("Apartment: %.2f lv.%n", totalPriceApartment);
        System.out.printf("Studio: %.2f lv.", totalPriceStudio);
    }
}
