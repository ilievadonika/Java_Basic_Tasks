import java.util.Scanner;

public class NumberInRange_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        boolean valid = (number >= -100 && number <= 100 && number != 0 );

        if(valid){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
