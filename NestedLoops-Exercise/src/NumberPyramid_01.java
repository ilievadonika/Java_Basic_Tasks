import java.util.Scanner;

public class NumberPyramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 1;
        boolean isBigger = false;
        for (int row = 1; row <= n; row++){
            for (int column = 1; column <= row; column++){
                System.out.printf("%d ", counter);
                counter += 1;
                if(counter > n){
                    isBigger = true;
                    break;
                }
            }
            if(isBigger){
                break;
            }
            System.out.println();
        }
    }
}
