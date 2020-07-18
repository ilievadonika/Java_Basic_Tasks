import java.util.Scanner;

public class BeehivePopulation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startPopulation = Integer.parseInt(scanner.nextLine());
        int years = Integer.parseInt(scanner.nextLine());

        int newPopulation = 0;
        int deadPopulation = 0;
        int migration = 0;
        int totalPopulation = 0;


        for (int i = 1; i <= years; i++){
            newPopulation = (startPopulation / 10) * 2;
            deadPopulation = ((startPopulation + newPopulation) / 20) * 2;
            totalPopulation = startPopulation + newPopulation - deadPopulation;
            if(i % 5 == 0){
                migration = ((startPopulation + newPopulation) / 50) * 5;
                deadPopulation = (((startPopulation + newPopulation) - migration) / 20) * 2;
                totalPopulation = (newPopulation + startPopulation) - migration - deadPopulation;
            }
            startPopulation = totalPopulation;
        }
        System.out.printf("Beehive population: %d", totalPopulation);
    }
}
