import java.util.Scanner;

public class HoneyHarvest_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int numberFlowers = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double honeyProduction = 0;

        switch (season){
            case "Spring":
                if(flower.equals("Sunflower")){
                    honeyProduction = 10 * numberFlowers;
                }else if(flower.equals("Daisy")){
                    honeyProduction = (12 * numberFlowers) + (12 * numberFlowers * 0.1);
                }else if(flower.equals("Lavender")){
                    honeyProduction = 12 * numberFlowers;
                }else if(flower.equals("Mint")){
                    honeyProduction = (10 * numberFlowers) + (10 * numberFlowers * 0.1);
                }
                break;
            case "Summer":
                if(flower.equals("Sunflower") || flower.equals("Daisy") || flower.equals("Lavender")){
                    honeyProduction = 8 * numberFlowers + (8 * numberFlowers * 0.1);
                }else if(flower.equals("Mint")){
                    honeyProduction = (12 * numberFlowers) + (12 * numberFlowers * 0.1);
                }
                break;
            case "Autumn":
                if(flower.equals("Daisy") || flower.equals("Lavender") || flower.equals("Mint")){
                    honeyProduction = 6 * numberFlowers - (6 * numberFlowers * 0.05);
                }else if(flower.equals("Sunflower")){
                    honeyProduction = (12 * numberFlowers) - (12 * numberFlowers * 0.05);
                }
                break;
        }

        System.out.printf("Total honey harvested: %.2f", honeyProduction);
    }
}
