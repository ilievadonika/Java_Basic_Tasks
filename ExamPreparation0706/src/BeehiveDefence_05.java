import java.util.Scanner;

public class BeehiveDefence_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberBees = Integer.parseInt(scanner.nextLine());
        int bearHealth = Integer.parseInt(scanner.nextLine());
        int bearAttack = Integer.parseInt(scanner.nextLine());

        int beesLeft = 0;
        int healthLeft = 0;
        int allBees = numberBees;

        while(bearHealth > 0){
            beesLeft = allBees - bearAttack;
            if(beesLeft >= 100){
                healthLeft = bearHealth - (beesLeft * 5);
                bearHealth = healthLeft;
                allBees = beesLeft;
            }else {
                if(beesLeft < 0){
                    beesLeft = 0;
                }
                System.out.printf("The bear stole the honey! Bees left %d.", beesLeft);
                break;
            }
        }
        if (bearHealth <= 0) {
            System.out.printf("Beehive won! Bees left %d.", beesLeft);
        }
    }
}
