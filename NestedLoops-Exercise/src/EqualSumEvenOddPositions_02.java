import java.util.Scanner;

public class EqualSumEvenOddPositions_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        for (int i = startNumber; i <= endNumber; i++){
            int evenDigitsSum = 0;
            int oddDigitsSum = 0;

            boolean isEvenPosition = true;
            int currentNumber = i;

            while (currentNumber > 0){
                int lastDigit = currentNumber % 10;
                if(isEvenPosition){
                    evenDigitsSum += lastDigit;
                    isEvenPosition = false;
                } else {
                    oddDigitsSum += lastDigit;
                    isEvenPosition = true;
                }
                currentNumber /= 10;
            }
            if(evenDigitsSum == oddDigitsSum){
                System.out.printf("%d ", i);
            }
        }
    }
}
