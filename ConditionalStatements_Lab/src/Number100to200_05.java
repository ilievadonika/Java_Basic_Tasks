import java.util.Scanner;

public class Number100to200_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if(number < 100){
            System.out.println("Less than 100");
        }else if(number >= 100 && 200 >= number){
            System.out.println("Between 100 and 200");
        }else if(number >= 200){
            System.out.println("Greater than 200");
        }
    }
}
