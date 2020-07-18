import java.util.Scanner;

public class Marin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hourExam = Double.parseDouble(scanner.nextLine());
        double minutesExam = Double.parseDouble(scanner.nextLine());
        double hourArrival = Double.parseDouble(scanner.nextLine());
        double minutesArrival = Double.parseDouble(scanner.nextLine());

        double minutesExamPerHour = minutesExam / 60;
        double minutesArrivalPerHour = minutesArrival / 60;
        double timeExam = hourExam + minutesExamPerHour;
        double timeArrival = hourArrival + minutesArrivalPerHour;

        if(timeArrival > timeExam){
            double differenceInMinutes = Math.round((timeArrival - timeExam) * 60);
            if(differenceInMinutes >= 60){
               double differenceInHours = differenceInMinutes / 60;
               double minutesLeft = differenceInMinutes % 60;
                System.out.println("Late");
                if(minutesLeft < 10){
                    System.out.printf("%d:0%d hours after the start", (int) differenceInHours, (int) minutesLeft);
                }else {
                    System.out.printf("%d:%d hours after the start", (int) differenceInHours, (int) minutesLeft);
                }
            }else{
                System.out.println("Late");
                System.out.printf("%d minutes after the start", (int) differenceInMinutes);
            }
        }else if((timeExam - timeArrival) > 0.5){
            double difference1 = Math.round((timeExam - timeArrival) * 60);
            if(difference1 >= 60){
                double differenceInHours = difference1 / 60;
                double minutesLeft = difference1 % 60;
                System.out.println("Early");
                if(minutesLeft < 10){
                    System.out.printf("%d:0%d hours before the start", (int) differenceInHours, (int) minutesLeft);
                }else {
                    System.out.printf("%d:%d hours before the start", (int) differenceInHours, (int) minutesLeft);
                }
            }else{
                System.out.println("Early");
                System.out.printf("%d minutes before the start", (int)difference1);
            }
        }else {
            if((timeExam - timeArrival) != 0){
                double difference2 = timeExam - timeArrival;
                double minutesBefore = Math.round(difference2 * 60);
                System.out.println("On time");
                System.out.printf("%d minutes before the start", (int) minutesBefore);
            }else {
                System.out.println("On time");
            }
        }
    }
}
