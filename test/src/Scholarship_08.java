import java.util.Scanner;

public class Scholarship_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double familyIncome = Double.parseDouble(scanner.nextLine());
        double averageSuccess = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double socialScholarship = 0;
        double scholarshipForSuccess = 0;

        if(familyIncome > minSalary){
            socialScholarship = 0;
        }else{
            if(averageSuccess > 4.5){
                socialScholarship = 0.35 * minSalary;
            }

        }

        if(averageSuccess < 5.5){
            scholarshipForSuccess = 0;
        }else if(averageSuccess >= 5.5){
            scholarshipForSuccess = averageSuccess * 25;
        }

        if(socialScholarship > scholarshipForSuccess){
            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship));
        }else if(scholarshipForSuccess > socialScholarship){
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(scholarshipForSuccess));
        }else{
            System.out.println("You cannot get a scholarship!");
        }


    }
}
