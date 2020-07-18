import java.util.Scanner;

public class TaskAquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. read input
        // 2. calculate volume in sm ^ 3
        // 3. calculate volume in liters
        // 4. used space
        // 5. calculate free space

        int length = Integer.parseInt(scanner.nextLine());
        int weight = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volumeCm = length*weight*height;
        double volumeLiters = volumeCm*0.001;
        double percentNumber = percent*0.01;
        double needLiters = volumeLiters*(1 - percentNumber);
        System.out.printf("%.3f", needLiters);

    }
}
