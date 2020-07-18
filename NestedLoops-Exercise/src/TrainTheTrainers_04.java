import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juryCount = Integer.parseInt(scanner.nextLine());
        int counterParticipants = 0;
        double allParticipantsAverageGrade = 0;

        while (true){
            String input = scanner.nextLine();

            if(input.equals("Finish")){
                break;
            }
            counterParticipants++;
            String presentationName = input;

            double averagePresentationGrade = 0;
            for (int i = 0; i < juryCount; i++){
                double grade = Double.parseDouble(scanner.nextLine());
                averagePresentationGrade += grade;
            }
            averagePresentationGrade /= juryCount;
            allParticipantsAverageGrade += averagePresentationGrade;
            System.out.printf("%s - %.2f.%n", presentationName, averagePresentationGrade);
        }
        allParticipantsAverageGrade /= counterParticipants;
        System.out.printf("Student's final assessment is %.2f.", allParticipantsAverageGrade);
    }
}
