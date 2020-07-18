import java.util.Scanner;

public class OpearationBetweenNumbers_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);

        switch (operator){
            case '+' :
               int sum = N1 + N2;
                if(sum % 2 == 0){
                    System.out.printf("%d + %d = %d - even", N1, N2, sum);
                }else {
                    System.out.printf("%d + %d = %d - odd", N1, N2, sum);
                }
                break;
            case '-' :
                int result = N1 - N2;
                if(result % 2 == 0){
                    System.out.printf("%d - %d = %d - even", N1, N2, result);
                }else {
                    System.out.printf("%d - %d = %d - odd", N1, N2, result);
                }
                break;
            case '*' :
                result = N1 * N2;
                if(result % 2 == 0){
                    System.out.printf("%d * %d = %d - even", N1, N2, result);
                }else {
                    System.out.printf("%d * %d = %d - odd", N1, N2, result);
                }
                break;
            case '/' :
                if(N2 == 0){
                    System.out.printf("Cannot divide %d by zero", N1);
                }else{
                    double division = N1 * 1.0 / N2;
                    System.out.printf("%d / %d = %.2f", N1, N2, division);
                }
                break;
            case '%' :
                if(N2 == 0){
                    System.out.printf("Cannot divide %d by zero", N1);
                }else{
                    double leftover = N1 % N2;
                    System.out.printf("%d %% %d = %.0f", N1, N2, leftover);
                }
                break;
        }
    }
}
