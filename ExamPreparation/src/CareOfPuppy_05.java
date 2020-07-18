import java.util.Scanner;

public class CareOfPuppy_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boughtFoodInKg = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int boughtFoodInGr = boughtFoodInKg * 1000;
        int eatenFoodInGr = 0;
        int allFoodEaten = 0;

        while (!input.equals("Adopted")){
            eatenFoodInGr = Integer.parseInt(input);
            allFoodEaten += eatenFoodInGr;

            input = scanner.nextLine();
        }
        if(allFoodEaten > boughtFoodInGr){
            int neededFood = allFoodEaten - boughtFoodInGr;
            System.out.printf("Food is not enough. You need %d grams more.", neededFood);
        }
        if(allFoodEaten <= boughtFoodInGr) {
            int foodLeft = Math.abs(allFoodEaten - boughtFoodInGr);
            System.out.printf("Food is enough! Leftovers: %d grams.", foodLeft);
        }
    }
}
