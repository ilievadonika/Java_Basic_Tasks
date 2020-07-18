import java.util.Scanner;

public class OnTimeForTheExam_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examTimeHours = Integer.parseInt(scanner.nextLine());
        int examTimeMinutes = Integer.parseInt(scanner.nextLine());
        int hourOfArrival = Integer.parseInt(scanner.nextLine());
        int minuteOfArrival = Integer.parseInt(scanner.nextLine());

        int differenceInMinutes;
        int differenceInHours;

        if (examTimeHours == hourOfArrival) {
            if (examTimeMinutes == minuteOfArrival) {
                System.out.println("On time");
            } else if (examTimeMinutes < minuteOfArrival) {
                differenceInMinutes = minuteOfArrival - examTimeMinutes;
                if (differenceInMinutes <= 30) {
                    System.out.println("Late");
                    System.out.printf("%d minutes after the start", differenceInMinutes);
                } else {
                    System.out.println("On time");
                }
            } else if (examTimeMinutes > minuteOfArrival) {
                differenceInMinutes = examTimeMinutes - minuteOfArrival;
                if (differenceInMinutes <= 30) {
                    System.out.println("On time");
                } else {
                    System.out.println("Early");
                    System.out.printf("%d minutes before the start", differenceInMinutes);
                }
            }
        } else if (examTimeHours < hourOfArrival) {
            differenceInHours = hourOfArrival - examTimeHours;
            if (examTimeMinutes == minuteOfArrival) {
                System.out.println("Late");
                System.out.printf("%d:00 hours after the start", differenceInHours);
            } else if (examTimeMinutes < minuteOfArrival) {
                if (differenceInHours >= 1) {
                    differenceInMinutes = minuteOfArrival - examTimeMinutes;
                    System.out.println("Late");
                    if (differenceInMinutes < 10) {
                        System.out.printf("%d:0%d minutes after the start", differenceInHours, differenceInMinutes);
                    } else {
                        System.out.printf("%d:%d minutes after the start", differenceInHours, differenceInMinutes);
                    }
                } else {
                    differenceInMinutes = minuteOfArrival - examTimeMinutes;
                    System.out.println("Late");
                    System.out.printf("%d minutes after the start", differenceInMinutes);
                }

            } else if (examTimeMinutes < minuteOfArrival) {
                if (differenceInHours > 1) {
                    differenceInHours = differenceInHours - 1;
                    differenceInMinutes = 60 - (examTimeMinutes - minuteOfArrival);
                    System.out.println("Early");
                    if (differenceInMinutes < 10) {
                        System.out.printf("%d:0%d hours before the start", differenceInHours, differenceInMinutes);
                    } else {
                        System.out.printf("%d:%d hours after the start", differenceInHours, differenceInMinutes);
                    }
                } else {
                    differenceInMinutes = 60 - (examTimeMinutes - minuteOfArrival);
                    System.out.println("Late");
                    System.out.printf("%d minutes after the start", differenceInMinutes);
                }
            } else if (examTimeHours < hourOfArrival) {
                differenceInHours = hourOfArrival - examTimeHours;
                if (examTimeMinutes == minuteOfArrival) {
                    System.out.println("Late");
                    System.out.printf("%d:00 hours after the start", differenceInHours);
                } else if (examTimeMinutes < minuteOfArrival) {
                    if (differenceInHours >= 1) {
                        differenceInMinutes = minuteOfArrival - examTimeMinutes;
                        System.out.println("Late");
                        if (differenceInMinutes < 10) {
                            System.out.printf("%d:0%d minutes after the start", differenceInHours, differenceInMinutes);
                        } else {
                            System.out.printf("%d:%d minutes after the start", differenceInHours, differenceInMinutes);
                        }
                    } else {
                        differenceInMinutes = minuteOfArrival - examTimeMinutes;
                        System.out.println("Late");
                        System.out.printf("%d minutes after the start", differenceInMinutes);
                    }

                } else if (examTimeMinutes > minuteOfArrival) {
                    if (differenceInHours > 1) {
                        differenceInHours = differenceInHours - 1;
                        differenceInMinutes = 60 - (examTimeMinutes - minuteOfArrival);
                        System.out.println("Late");
                        if (differenceInMinutes < 10) {
                            System.out.printf("%d:0%d hours after the start", differenceInHours, differenceInMinutes);
                        } else {
                            System.out.printf("%d:%d hours after the start", differenceInHours, differenceInMinutes);
                        }
                    } else {
                        differenceInMinutes = 60 - (examTimeMinutes - minuteOfArrival);
                        System.out.println("Late");
                        System.out.printf("%d minutes after the start", differenceInMinutes);
                    }
                }

            }
        }
    }}