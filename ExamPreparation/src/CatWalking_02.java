import java.util.Scanner;

public class CatWalking_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int walkingInMinutes = Integer.parseInt(scanner.nextLine());
        int countWalking = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        int countBurnedCalories = countWalking * (walkingInMinutes * 5);
        double percentCaloriesNeeded = calories * 0.5;

        if(countBurnedCalories >= percentCaloriesNeeded){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", countBurnedCalories);
        }else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", countBurnedCalories);
        }
    }
}
