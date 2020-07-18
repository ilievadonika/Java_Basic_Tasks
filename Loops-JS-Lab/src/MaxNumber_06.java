import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int counter = 0;

        while (counter < n){
           int number = Integer.parseInt(scanner.nextLine());
            if(number > maxNumber){
                maxNumber = number;
            }
            counter++;
        }
        System.out.println(maxNumber);
    }
}
