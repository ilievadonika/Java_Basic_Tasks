import java.util.Scanner;

public class Cinema_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeProjection = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());

        //•	Premiere – премиерна прожекция, на цена 12.00 лева.
        //•	Normal – стандартна прожекция, на цена 7.50 лева.
        //•	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.
        double premierProjection = 12;
        double normalProjection = 7.5;
        double discountProjection = 5;
        int countAllSeats = 0;
        double income = 0;

        if(row != 0 && column != 0){
            countAllSeats = row * column;
        }

        switch (typeProjection){
            case "Premiere" :
                income = countAllSeats * premierProjection;
                break;
            case "Normal" :
                income = countAllSeats * normalProjection;
                break;
            case "Discount" :
                income = countAllSeats * discountProjection;
                break;
        }
        System.out.printf("%.2f leva", income);
    }

}
