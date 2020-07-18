import java.util.Scanner;

public class SumOfNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        //begin 1
        //end 10
        //beginInterval -> endInterval
        int counter = 0;
        boolean weFoundIt = false;
        for (int i = beginInterval; i <= endInterval; i++){
            for(int j = beginInterval; j <= endInterval; j++){
                counter++;
                if(i + j == magicNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicNumber);
                    weFoundIt = true;
                    break;
                }
            }
            if(weFoundIt){
                break;
            }
        }
        if(!weFoundIt) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
