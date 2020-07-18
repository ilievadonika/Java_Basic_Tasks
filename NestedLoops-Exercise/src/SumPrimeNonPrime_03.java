import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeNumberSum = 0;
        int nonPrimeNumberSum = 0;

        while(true) {
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            int number = Integer.parseInt(input);

            if (number < 0) {
                System.out.println("Number is negative.");
            } else {
                boolean isPrime = true;
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primeNumberSum += number;
                } else {
                    nonPrimeNumberSum += number;
                }
            }
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeNumberSum);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeNumberSum);
    }
}
