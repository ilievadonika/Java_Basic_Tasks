import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double changeInLv = Double.parseDouble(scanner.nextLine());
        double change = Math.round(changeInLv * 100);

        int counter = 0;
        while (change > 0){
            if(change >= 200){
                change -= 200;
                counter++;
            }else if(change >= 100){
                change -= 100;
                counter++;
            }else if(change >= 50){
                change -= 50;
                counter++;
            }else if(change >= 20){
                change -= 20;
                counter++;
            }else if(change >= 10){
                change -= 10;
                counter++;
            }else if(change >= 5){
                change -= 5;
                counter++;
            }else if(change >= 2){
                change -= 2;
                counter++;
            }else if(change >= 1){
                change -= 1;
                counter++;
            }
        }
        System.out.println(counter);
    }
}
