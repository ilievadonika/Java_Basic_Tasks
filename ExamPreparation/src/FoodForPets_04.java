import java.util.Scanner;

public class FoodForPets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double foodAmount = Double.parseDouble(scanner.nextLine());

        double eatenFood = 0;
        double eatenByDog = 0;
        double eatenByCat = 0;
        double biscuits = 0;

        for(int i = 1; i <= days; i++){
            int eatenDogFood = Integer.parseInt(scanner.nextLine());
            int eatenCatFood = Integer.parseInt(scanner.nextLine());

            double foodForTheDay = eatenCatFood + eatenDogFood;
            eatenFood += foodForTheDay;
            eatenByDog += eatenDogFood;
            eatenByCat += eatenCatFood;

            if(i % 3 == 0){
                biscuits += foodForTheDay * 0.1;
            }
        }

        double percentEatenFood = 100 / (foodAmount / eatenFood);
        double percentEatenByDog = 100 / (eatenFood / eatenByDog);
        double percentEatenByCat = 100 / (eatenFood / eatenByCat);

        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", percentEatenFood);
        System.out.printf("%.2f%% eaten from the dog.%n", percentEatenByDog);
        System.out.printf("%.2f%% eaten from the cat.%n", percentEatenByCat);


    }
}
