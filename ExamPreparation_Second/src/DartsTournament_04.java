import java.util.Scanner;

public class DartsTournament_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingPoints = Integer.parseInt(scanner.nextLine());
        String sector = "";
        int numberPoints = 0;

        int countPoints = 0;
        int pointsResult = startingPoints;
        int countMoves = 0;

        while(pointsResult > 0){
            sector = scanner.nextLine();
            countMoves++;
            if(sector.equals("bullseye")){
                System.out.printf("Congratulations! You won the game with a bullseye in %d moves!", countMoves);
            }
            numberPoints = Integer.parseInt(scanner.nextLine());

            if(sector.equals("number section")){
                countPoints = numberPoints;
            }else if(sector.equals("double ring")){
                countPoints = numberPoints * 2;
            }else if(sector.equals("triple ring")){
                countPoints = numberPoints * 3;
            }

            pointsResult -= countPoints;
            if(pointsResult < 0){
                System.out.printf("Sorry, you lost. Score difference: %d.", Math.abs(pointsResult));
                break;
            }
        }
        if(pointsResult == 0){
            System.out.printf("Congratulations! You won the game in %d moves!", countMoves);
        }
    }
}
