import java.util.Scanner;

public class HoneyWinterReverse_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double honey = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        double totalProduction = 0;
        double honeyNeed = honey - totalProduction;
        double honeyLeft = totalProduction - honey;

        while (!input.equals("Winter has come")){
            String beeName = input;

            for(int i = 1; i <= 6; i++){
                double production = Double.parseDouble(scanner.nextLine());
                totalProduction += production;
            }
            if(totalProduction <= 0){
                System.out.printf("%s was banished for gluttony%n", beeName);
            }

            if(totalProduction >= honey){
                System.out.printf("Well done! Honey surplus %.2f.%n", totalProduction - honey);
                break;
            }

            input = scanner.nextLine();
        }

        if(totalProduction < honey){
            System.out.printf("Hard Winter! Honey needed %.2f.%n", honey - totalProduction);
        }else {
            System.out.printf("Well done! Honey surplus %.2f.%n", totalProduction - honey);
        }
    }
}
