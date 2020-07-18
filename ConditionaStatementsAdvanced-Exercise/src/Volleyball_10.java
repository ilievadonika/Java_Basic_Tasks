import java.util.Scanner;

public class Volleyball_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine()); // special days
        int h = Integer.parseInt(scanner.nextLine()); // travelling home days

        int weekends = 48;
        double sumDays;
        //1. Check is it leap or normal year - with if statement
        //   *if its leap - he is playing 15% more volleyball than in the normal year
        //2. Check which are the weekends that he is playing:(48 weekends)
        //    *every Saturday if he is not working or traveling- 3/4 && h
        //    *every Sunday
        //3.Sum total volleyball days and print it

        if(year.equals("normal")){
            weekends = weekends - h;
            double saturdayGames = weekends * 0.75;
            double specialDaysGames = p * 2.0 / 3.0;
            sumDays = Math.floor(saturdayGames + specialDaysGames + h) ;

            System.out.println((int)sumDays);
        }else if(year.equals("leap")){
            weekends = weekends - h;
            double saturdayGames = weekends * 0.75;
            double specialDaysGames = p * 2.0 / 3.0;
            sumDays = saturdayGames + specialDaysGames + h;
            double bonusGames = Math.floor(sumDays + sumDays * 0.15);

            System.out.println((int)bonusGames);
        }
    }
}
