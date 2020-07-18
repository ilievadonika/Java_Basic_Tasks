import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int sumSteps = 0;
        int steps = 0;

        while (!command.equals("Going home")){
            steps = Integer.parseInt(command);
            sumSteps += steps;
            if(sumSteps >= 10000){
                System.out.print("Goal reached! Good job!");
                break;
            }
            command = scanner.nextLine();
        }

        if(command.equals("Going home")) {
            steps = Integer.parseInt(scanner.nextLine());
            sumSteps += steps;
            if (sumSteps < 10000) {
                int stepsLeft = 10000 - sumSteps;
                System.out.printf("%d more steps to reach goal.", stepsLeft);
            } else {
                System.out.println("Goal reached! Good job!");
            }
        }
    }
}
