import java.util.Scanner;

public class Moving_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int roomWeight = Integer.parseInt(scanner.nextLine());
        int roomLength = Integer.parseInt(scanner.nextLine());
        int roomHeight = Integer.parseInt(scanner.nextLine());
        String boxes = scanner.nextLine();

        int volumeSpace = roomHeight * roomLength * roomWeight;
        int wastedSpace = 0;
        int freeSpace = 0;

        while(!boxes.equals("Done")){
            wastedSpace = wastedSpace + Integer.parseInt(boxes);
            freeSpace = volumeSpace - wastedSpace;
            if( freeSpace < 0){
                int neededSpace = wastedSpace - volumeSpace;
                System.out.printf("No more free space! You need %d Cubic meters more.", neededSpace);
                break;
            }
            boxes = scanner.nextLine();
        }
        if(freeSpace > 0){
            int leftSpace = volumeSpace - wastedSpace;
            System.out.printf("%d Cubic meters left.", leftSpace);
        }
    }
}
