import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sumOddPosition = 0;
        int sumEvenPosition = 0;

        //even positions = 2, 4, 6, 8...
        for(int i = 0; i < n; i++){
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if(i % 2 == 0) {
                sumEvenPosition = sumEvenPosition + currentNumber;
            }else{
                sumOddPosition = sumOddPosition + currentNumber;
            }
        }

        if(sumEvenPosition == sumOddPosition){
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumEvenPosition);
        }else{
            int difference = Math.abs(sumEvenPosition - sumOddPosition);
            System.out.println("No");
            System.out.printf("Diff = %d", difference);
        }
    }
}
