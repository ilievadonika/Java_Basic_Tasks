import java.util.Scanner;

public class SumOfOddNumbers_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oddCount = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for(int i = 1; i <= oddCount * 2 ; i += 2){
            sum += i;
            System.out.println(i);
        }

        System.out.println("Sum: " + sum);

    }
}
