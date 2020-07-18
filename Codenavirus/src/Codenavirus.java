import java.util.Scanner;
import java.util.Arrays;

public class Codenavirus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 3;

        char[][] world = new char[n][n];

        System.out.print("world = ");

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < n; j++) {
                world[i][j] = line.charAt(j);
            }
            System.out.print("        ");
        }

        System.out.println();
        System.out.print("firstInfected = ");
        char matrixRow = scanner.next().charAt(0);
        char matrixCol = scanner.next().charAt(0);
        System.out.print(matrixRow);
        System.out.println(matrixCol);

        System.out.println("[");
        for (char[] row : world) {
            System.out.println(Arrays.toString(row) + ",");
        }
        System.out.println("]");

        System.out.println("Day 1:");

        for(int i = 0; i < world.length; i++) {
            for(int j = 0; j < world[i].length; j++) {

                /** check if array[i][j] contains your desired value **/

            }
        }

        world[matrixRow][matrixCol] = 'H';
        System.out.println("[");
        for (char[] row : world) {
            System.out.println(Arrays.toString(row) + ",");
        }
        System.out.println("]");

    }

}

