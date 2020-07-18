import java.util.Scanner;

public class PointOnRectangleBorder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //x1, y1, x2, y2, x и y
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        //x съвпада с x1 или x2 и същевременно y е между y1 и y2
        //y съвпада с y1 или y2 и същевременно x е между x1 и x2
        boolean check1 = (x == x1 || x == x2) && (y >= y1 && y <= y2);
        boolean check2 = (y == y1 || y == y2) && (x >= x1 && x <= x2);

        if(check1 || check2){
            System.out.println("Border");
        }else {
            System.out.println("Inside / Outside");
        }
    }
}
