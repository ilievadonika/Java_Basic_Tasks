import java.util.Scanner;

public class GraduationPart2_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int currentGrade = 1;
        double sum = 0;
        int numberOfRepetitions = 0;
        boolean isExcluded = false;

        while (currentGrade <= 12){
            double mark = Double.parseDouble(scanner.nextLine());
            if(mark < 4){
                numberOfRepetitions++;
                if(numberOfRepetitions == 2){
                    isExcluded = true;
                    System.out.printf("%s has been excluded at %d grade", studentName, currentGrade);
                    break;
                }
                continue;
            }
            sum = sum + mark;
            currentGrade++;
        }
        if(!isExcluded) {
            double average = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", studentName, average);
        }
    }
}
