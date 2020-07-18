import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMarks = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int badMarks = 0;
        double sum = 0;
        String lastTask = "";
        boolean isFailed = true;

        while (badMarks < countMarks){
            String name = scanner.nextLine();
            if(name.equals("Enough")){
                isFailed = false;
                break;
            }
            int mark = Integer.parseInt(scanner.nextLine());
            if(mark <= 4){
                badMarks++;
            }
            sum += mark;
            counter++;
            lastTask = name;
        }

        if(isFailed){
            System.out.printf("You need a break, %d poor grades.", badMarks);
        }else {
            System.out.printf("Average score: %.2f%n", sum / counter );
            System.out.printf("Number of problems: %d%n", counter);
            System.out.printf("Last problem: %s%n", lastTask);
        }
    }
}
