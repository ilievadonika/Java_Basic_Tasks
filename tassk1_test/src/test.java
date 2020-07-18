import java.util.Scanner;

public class test{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter elements...");
        char[] a = sc.next().toCharArray(0);
        System.out.println("Array elements are : ");
        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);

    }
}
