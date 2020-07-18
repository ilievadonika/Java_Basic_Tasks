import java.util.Scanner;

public class TournamentOfChristmas_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentDays = Integer.parseInt(scanner.nextLine());
        double winMoney = 0;
        double totalMoney = 0;
        int countWins = 0;
        int countLoses = 0;
        int countDays = 0;
        int countGreatDays = 0;
        int countBadDays = 0;

        for(int i = 1; i <= tournamentDays; i++){
            String input = scanner.nextLine();
            countLoses = 0;
            countWins = 0;
            winMoney = 0;

            while (!input.equals("Finish")) {
                input = scanner.nextLine();

                if (input.equals("win")) {
                    winMoney += 20;
                    countWins++;
                } else if(input.equals("lose")){
                    countLoses++;
                }

                input = scanner.nextLine();
            }

            if (countWins > countLoses) {
                winMoney += winMoney * 0.1;
                countGreatDays++;
            }else {
                countBadDays++;
            }
            totalMoney += winMoney;
            countDays++;
        }
        if(countGreatDays > countBadDays){
            totalMoney += totalMoney * 0.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        }else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }
    }
}
