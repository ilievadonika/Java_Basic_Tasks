import java.util.Scanner;

public class PasswordGenerator_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        for(int digit1 = 1; digit1 < n; digit1++){
            for(int digit2 = 1; digit2 < n; digit2++){
                for (int digit3 = 'a'; digit3 < 'a' + l; digit3++){
                    for (int digit4 = 'a'; digit4 < 'a' + l; digit4++){
                        for (int digit5 = Math.max(digit1, digit2) + 1; digit5 <= n; digit5++ ){
                            System.out.printf("%d%d%c%c%d ", digit1, digit2, digit3, digit4, digit5);
                        }
                    }
                }
            }
        }
    }
}
