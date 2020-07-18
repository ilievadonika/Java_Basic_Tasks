import java.util.Scanner;

public class CinemaTickets_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int studentCnt = 0;
        int standardCnt = 0;
        int kidCnt = 0;

        while (!input.equals("Finish")) {
            int capacity = Integer.parseInt(scanner.nextLine());
            int totalTickets = 0;
            for (int i = 0; i < capacity; i++) {
                String ticketType = scanner.nextLine();
                if (ticketType.equals("End")) {
                    break;
                }
                switch (ticketType) {
                    case "kid":
                        kidCnt++;
                        break;
                    case "standard":
                        standardCnt++;
                        break;
                    case "student":
                        studentCnt++;
                        break;
                }
                totalTickets++;
            }
            double percent = totalTickets * 1.0 / capacity * 100;
            System.out.printf("%s - %.2f%% full.%n", input, percent);
            input = scanner.nextLine();
        }
        int totalTickets = standardCnt + studentCnt + kidCnt;
        System.out.printf("Total tickets: %d%n" , totalTickets);
        double studentPercent = studentCnt * 1.0 / totalTickets * 100;
        System.out.printf("%.2f%% student tickets.%n", studentPercent);
        double standardPercent = standardCnt * 1.0 / totalTickets * 100;
        System.out.printf("%.2f%% standard tickets.%n", standardPercent);
        double kidPercent = kidCnt * 1.0 / totalTickets * 100;
        System.out.printf("%.2f%% kids tickets.%n", kidPercent);
    }
}

