import java.util.Scanner;

public class test{
public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

    System.out.println("enter number of elements");

    int n = scanner.nextInt();

    int arr[] = new int[n];

    System.out.println("enter elements");

    for(int i = 0; i < n; i++){//for reading array
        arr[i] = scanner.nextInt();
    }

    for(int i: arr) { //for printing array

        System.out.println(i);
    }

    }
}
