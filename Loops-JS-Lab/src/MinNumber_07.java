import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int minNumber = Integer.MAX_VALUE;
        int counter = 0;

        while (counter < n){
            int number = Integer.parseInt(scanner.nextLine());
            if(number < minNumber){
                minNumber = number;
            }
            counter++;
        }
        System.out.println(minNumber);
    }
}
