import java.util.Scanner;

public class BeehiveRole_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intelligence = Integer.parseInt(scanner.nextLine());
        int strength = Integer.parseInt(scanner.nextLine());
        String gender = scanner.nextLine();

        String role = "";

        if(intelligence >= 80){
            if(strength >= 80){
                if(gender.equals("female")){
                    role = "Queen Bee";
                }else{
                    role = "Repairing Bee";
                }
            }else {
                role = "Repairing Bee";
            }
        }else if(intelligence >= 60){
            role = "Cleaning Bee";
        }else {
            if(strength >= 80){
                if(gender.equals("male")){
                    role = "Drone Bee";
                }else {
                    role = "Guard Bee";
                }
            }else if(strength >= 60){
                role = "Guard Bee";
            }else {
                role = "Worker Bee";
            }
        }

        System.out.println(role);
    }
}
