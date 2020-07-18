import java.util.Scanner;

public class Readtext_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = 0;

        while(!input.equals("Stop")){
            input = scanner.nextLine();
            count++;
        }
        System.out.println(count);
    }
}
