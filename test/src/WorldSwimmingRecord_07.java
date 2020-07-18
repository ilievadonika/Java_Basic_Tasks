import java.util.Scanner;

public class WorldSwimmingRecord_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine()); //1064
        double distanceInMeters = Double.parseDouble(scanner.nextLine()); //1500
        double time = Double.parseDouble(scanner.nextLine()); // 20 sec

        double slow = Math.floor(distanceInMeters / 15);
        double totalTime; // 30000

        if(slow != 0){
            totalTime =(time * distanceInMeters) + slow * 12.5;
        } else{
            totalTime = distanceInMeters * time;
        }

        if(totalTime < record){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }else {
            double neededTime = totalTime - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", neededTime);
        }
    }
}
