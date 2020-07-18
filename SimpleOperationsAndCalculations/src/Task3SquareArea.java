import java.util.Scanner;

public class Task3SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. въвеждане на цяло число "а" от клавиатурата
        //2. добавяне на променлива, за да съхраним лицето на квадрат
        //3. извършване на пресмятането

        int a = Integer.parseInt(scanner.nextLine());
        int squareArea = a * a;

        System.out.println(squareArea);
    }
}
