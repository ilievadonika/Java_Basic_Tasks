import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int currentGrade = 1;
        double sum = 0;

        while (currentGrade <= 12){
            double mark = Double.parseDouble(scanner.nextLine());
            if(mark < 4){
                continue;
            }
            sum = sum + mark;
            currentGrade++;
        }
        double average = sum / 12;
        System.out.printf("%s graduated. Average grade: %.2f", studentName, average);

    }
}
