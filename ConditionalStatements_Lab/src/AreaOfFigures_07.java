import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        double area;

        if(figure.equals("square")){
            double side = Double.parseDouble(scanner.nextLine());
            area = side * side;
            System.out.printf("%.3f", area);
        }else if(figure.equals("rectangle")){
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            area = sideA * sideB;
            System.out.printf("%.3f", area);
        }else if(figure.equals("circle")){
            double radius = Double.parseDouble(scanner.nextLine());
            area = radius * radius * Math.PI;
            System.out.printf("%.3f", area);
        }else if(figure.equals("triangle")){
            double height = Double.parseDouble(scanner.nextLine());
            double side = Double.parseDouble(scanner.nextLine());
            area = (height * side)/2;
            System.out.printf("%.3f", area);
        }else {
            System.out.println("No figure");
        }

    }
}
