import java.util.Scanner;

public class DivideWithoutReminder_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countFirst = 0;
        int countSecond = 0;
        int countThird = 0;

        for (int number = 1; number <= n; number++){
            int value = Integer.parseInt(scanner.nextLine());
            if(value % 2 == 0){
                countFirst++;
            }
            if(value % 3 == 0){
                countSecond++;
            }
            if(value % 4 == 0){
                countThird++;
            }
        }
        double p1 = (countFirst * 1.0) / n * 100;
        double p2 = (countSecond * 1.0) / n * 100;
        double p3 = (countThird * 1.0) / n * 100;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%", p1, p2, p3);
    }
}
