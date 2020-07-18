import java.util.Scanner;

public class CruiseGames_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int numberGames = Integer.parseInt(scanner.nextLine());

        double countPoints = 0;
        double volleyballPoints = 0;
        double tennisPoints = 0;
        double badmintonPoints = 0;

        int countVolleyballGames = 0;
        int countTennisGames = 0;
        int countBadmintonGames = 0;

        for(int i = 1; i <= numberGames; i++){
            String gameName = scanner.nextLine();
            int points = Integer.parseInt(scanner.nextLine());

            switch (gameName){
                case "volleyball":
                    countPoints = points + points * 0.07;
                    volleyballPoints += countPoints;
                    countVolleyballGames++;
                    break;
                case "tennis":
                    countPoints = points + points * 0.05;
                    tennisPoints += countPoints;
                    countTennisGames++;
                    break;
                case "badminton":
                    countPoints = points + points * 0.02;
                    badmintonPoints += countPoints;
                    countBadmintonGames++;
                    break;
            }
        }
        double averageVPoints = Math.floor(volleyballPoints / countVolleyballGames);
        double averageTennisPoints = Math.floor(tennisPoints / countTennisGames);
        double averageBadmintonPoints = Math.floor(badmintonPoints / countBadmintonGames);

        double sumPoints = Math.floor(volleyballPoints + tennisPoints + badmintonPoints);

        if(averageVPoints >= 75 && averageTennisPoints >= 75 && averageBadmintonPoints >= 75){
            System.out.printf("Congratulations, %s! You won the cruise games with %.0f points.%n", name, sumPoints);
        }else{
            System.out.printf("Sorry, %s, you lost. Your points are only %.0f.", name, sumPoints);
        }
    }
}
