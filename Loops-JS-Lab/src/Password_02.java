import java.util.Scanner;

public class Password_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //username -> потребителско име "Иван"
        //password -> паролата "1234A"
        //input -> докато input != password
        //Welcome username

        String userName = scanner.nextLine();
        String password = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals(password)){
            input= scanner.nextLine();
        }
        System.out.printf("Welcome %s!", userName);
    }
}
