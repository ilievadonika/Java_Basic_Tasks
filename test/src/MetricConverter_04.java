import java.util.Scanner;

public class MetricConverter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberToChange = Double.parseDouble(scanner.nextLine());
        String metricInput = scanner.nextLine();
        String metricOutput = scanner.nextLine();

        if(metricInput.equals("mm")){
            if(metricOutput.equals("cm")){
                numberToChange = numberToChange / 10;
            }else if(metricOutput.equals("m")){
                numberToChange = numberToChange / 1000;
            }
        }else if(metricInput.equals("cm")){
            if(metricOutput.equals("mm")){
                numberToChange = numberToChange * 10;
            } else if(metricOutput.equals("m")){
                numberToChange = numberToChange / 100;
            }
        }else if(metricInput.equals("m")){
            if(metricOutput.equals("mm")){
                numberToChange = numberToChange * 1000;
            }else if(metricOutput.equals("cm")){
                numberToChange = numberToChange * 100;
            }
        }
        System.out.printf("%.3f",numberToChange);


    }
}
