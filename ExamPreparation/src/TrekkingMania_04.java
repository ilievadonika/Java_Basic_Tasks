import java.util.Scanner;

public class TrekkingMania_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countClimbers = Integer.parseInt(scanner.nextLine());
        int climbingMusala = 0;
        int climbingMonblan = 0;
        int climbingKilimandzharo = 0;
        int climbingK2 = 0;
        int climbingEverest = 0;
        int allPeople = 0;

        for(int group = 1; group <= countClimbers; countClimbers--){
            int numberGroup = Integer.parseInt(scanner.nextLine());
            allPeople += numberGroup;
            if(numberGroup <= 5){
                climbingMusala += numberGroup;
            }else if(numberGroup >= 6 && numberGroup <= 12){
                climbingMonblan += numberGroup;
            }else if(numberGroup >= 13 && numberGroup <= 25){
                climbingKilimandzharo += numberGroup;
            }else if(numberGroup >= 26 && numberGroup <= 40){
                climbingK2 += numberGroup;
            }else if(numberGroup >= 41){
                climbingEverest += numberGroup;
            }
        }

        double percentMusala = (climbingMusala * 1.0 / allPeople) * 100;
        double percentMonblan = (climbingMonblan * 1.0 / allPeople) * 100;
        double percentKilimandzharo = (climbingKilimandzharo * 1.0 / allPeople) * 100;
        double percentK2 = (climbingK2 * 1.0 / allPeople) * 100;
        double percentEverest = (climbingEverest * 1.0 / allPeople) * 100;

        System.out.printf("%.2f%%%n", percentMusala);
        System.out.printf("%.2f%%%n", percentMonblan);
        System.out.printf("%.2f%%%n", percentKilimandzharo);
        System.out.printf("%.2f%%%n", percentK2);
        System.out.printf("%.2f%%", percentEverest);

    }
}
