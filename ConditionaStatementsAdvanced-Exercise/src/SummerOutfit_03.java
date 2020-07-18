import java.util.Scanner;

public class SummerOutfit_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degree = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        if(degree >= 10 && degree <= 18 && timeOfDay.equals("Morning")){
            System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", degree);
        }else if(degree >= 10 && degree <= 18 && timeOfDay.equals("Afternoon")){
            System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
        }else if(degree >= 10 && degree <= 18 && timeOfDay.equals("Evening")){
            System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
        }

        if(degree > 18 && degree <= 24 && timeOfDay.equals("Morning")){
            System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
        }else if(degree > 18 && degree <= 24 && timeOfDay.equals("Afternoon")){
            System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degree);
        }else if(degree > 18 && degree <= 24 && timeOfDay.equals("Evening")){
            System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
        }

        if(degree >= 25 && timeOfDay.equals("Morning")){
            System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", degree);
        }else if(degree >= 25 && timeOfDay.equals("Afternoon")){
            System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.", degree);
        }else if(degree >= 25 && timeOfDay.equals("Evening")){
            System.out.printf("It's %d degrees, get your Shirt and Moccasins.", degree);
        }

    }
}
