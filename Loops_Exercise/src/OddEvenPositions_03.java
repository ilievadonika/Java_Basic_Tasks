import java.util.Scanner;

public class OddEvenPositions_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //"OddSum=" + {сума на числата на нечетни позиции},
        //"OddMin=" + { минимална стойност на числата на нечетни позиции } / {“No”},
        //"OddMax=" + { максимална стойност на числата на нечетни позиции } / {“No”},
        //"EvenSum=" + { сума на числата на четни позиции },
        //"EvenMin=" + { минимална стойност на числата на четни позиции } / {“No”},
        //"EvenMax=" + { максимална стойност на числата на четни позиции } / {“No”}
        double OddSum = 0;
        double OddMin = 1000000000.0 ;
        double OddMax = -1000000000.0;
        double EvenSum = 0;
        double EvenMin = 1000000000.0 ;
        double EvenMax = -1000000000.0;

        for(int number = 1; number <= n; number++){
            double value = Double.parseDouble(scanner.nextLine());
            if(number % 2 == 0){
                EvenSum += value;
                if(value > EvenMax){
                    EvenMax = value;
                }
                if(value < EvenMin){
                    EvenMin = value;
                }
            }else {
                OddSum += value;
                if(value > OddMax){
                    OddMax = value;
                }
                if(value < OddMin){
                    OddMin = value;
                }
            }
        }

        System.out.printf("OddSum=%.2f,%n", OddSum);
        if(OddMin != 1000000000.0) {
            System.out.printf("OddMin=%.2f,%n", OddMin);
        }else {
            System.out.println("OddMin=No,");
        }
        if(OddMax != -1000000000.0 ){
            System.out.printf("OddMax=%.2f,%n", OddMax);
        }else {
            System.out.println("OddMax=No,");
        }
        System.out.printf("EvenSum=%.2f,%n", EvenSum);
        if(EvenMin != 1000000000.0){
            System.out.printf("EvenMin=%.2f,%n", EvenMin);
        }else{
            System.out.println("EvenMin=No,");
        }
        if(EvenMax != -1000000000.0 ){
            System.out.printf("EvenMax=%.2f%n", EvenMax);
        }else{
            System.out.println("EvenMax=No");
        }

    }
}
