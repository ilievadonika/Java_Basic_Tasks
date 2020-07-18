import java.util.Scanner;

public class Task4ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int time = projects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, time, projects);
    }
}
