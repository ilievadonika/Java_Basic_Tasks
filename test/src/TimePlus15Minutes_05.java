import java.util.Scanner;

public class TimePlus15Minutes_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int totalInMinutes = hour * 60 + minutes;
        int totalMinutesPlus15 = totalInMinutes + 15;
        int endHour = totalMinutesPlus15 / 60;
        int endMinutes = totalMinutesPlus15 % 60;

        if(endHour >= 24){
            endHour = 0;
        }

        System.out.printf("%d:%02d",endHour, endMinutes);

    }
}
