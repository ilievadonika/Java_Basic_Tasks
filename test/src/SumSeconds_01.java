import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read input -> time1, time2, time3
        int time1 = Integer.parseInt(scanner.nextLine());
        int time2 = Integer.parseInt(scanner.nextLine());
        int time3 = Integer.parseInt(scanner.nextLine());
        // sum = time1 + time2 + time3
        int sumSeconds = time1 + time2 + time3;
        //calculate minutes = total / 60
        int minutes = sumSeconds / 60;
        int seconds = sumSeconds % 60;
        //едноцифрени числа
        if(seconds < 10){
            //minutes:0seconds
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            //minutes:seconds
            System.out.printf("%d:%d", minutes, seconds);
        }


    }
}
