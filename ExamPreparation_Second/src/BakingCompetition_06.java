import java.util.Scanner;

public class BakingCompetition_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberParticipants = Integer.parseInt(scanner.nextLine());

        double cookiesCost = 0;
        double cakesCost = 0;
        double wafflesCost = 0;
        double total = 0;
        int countCookies = 0;
        int countCakes = 0;
        int countWaffles = 0;
        int allBakes = 0;

        for(int i = 1; i <= numberParticipants; i++) {
            String name = scanner.nextLine();
            String typeBake = scanner.nextLine();

            while (!typeBake.equals("Stop baking!")){
                int countBakes = Integer.parseInt(scanner.nextLine());
                if (typeBake.equals("cookies")) {
                    cookiesCost += countBakes * 1.5;
                    countCookies += countBakes;
                } else if (typeBake.equals("cakes")) {
                    cakesCost += countBakes * 7.8;
                    countCakes += countBakes;
                } else if (typeBake.equals("waffles")) {
                    wafflesCost += countBakes * 2.3;
                    countWaffles += countBakes;
                }
                allBakes += countBakes;
                typeBake = scanner.nextLine();
            }
            System.out.printf("%s baked %d cookies, %d cakes and %d waffles.%n", name, countCookies, countCakes, countWaffles);
            total = cookiesCost + cakesCost + wafflesCost;
            countCakes = 0;
            countCookies = 0;
            countWaffles = 0;
        }
            System.out.printf("All bakery sold: %d%n", allBakes);
            System.out.printf("Total sum for charity: %.2f lv.", total);
        }
}
