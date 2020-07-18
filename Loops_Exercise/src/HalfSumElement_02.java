import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int number = 1; number <= n; number++){
            int value = Integer.parseInt(scanner.nextLine());
            sum += value;

            if(value > max){
                max = value;
            }
        }
        int sumOthers = sum - max;

        if(max == sumOthers){
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        }else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(max - sumOthers));
        }

    }
}
