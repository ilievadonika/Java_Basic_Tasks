import java.util.Scanner;

public class MountainRun_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distanceInMeter = Double.parseDouble(scanner.nextLine());
        double timeInSeconds = Double.parseDouble(scanner.nextLine());

        double timeNeeded = distanceInMeter * timeInSeconds;
        double slowDown = Math.floor(distanceInMeter / 50) * 30;
        double totalTime = timeNeeded + slowDown;

        if(totalTime < record){
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        }else {
            double difference = totalTime - record;
            System.out.printf("No! He was %.2f seconds slower.", difference);
        }
    }
}
