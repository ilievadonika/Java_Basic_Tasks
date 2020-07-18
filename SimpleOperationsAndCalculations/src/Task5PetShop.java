import java.util.Scanner;

public class Task5PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberDogs = Integer.parseInt(scanner.nextLine());
        int numberPets = Integer.parseInt(scanner.nextLine());
        double dogFood = 2.50 * numberDogs;
        double petFood = 4.00 * numberPets;
        double sum = dogFood + petFood;
        System.out.printf("%.2f lv.", sum);
    }
}
