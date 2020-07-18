import java.util.Scanner;

public class TradeCommissions_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double volumeSales = Double.parseDouble(scanner.nextLine());
        double commission = 0;

        switch (city){
            case "Sofia" :
                if(volumeSales >= 0 && volumeSales <= 500){
                    commission = volumeSales * 0.05;
                }else if(volumeSales > 500 && volumeSales <= 1000){
                    commission = volumeSales * 0.07;
                }else if(volumeSales > 1000 && volumeSales <= 10000){
                    commission = volumeSales * 0.08;
                }else if(volumeSales > 10000){
                    commission = volumeSales * 0.12;
                }
                break;
            case "Varna" :
                if(volumeSales >= 0 && volumeSales <= 500){
                    commission = volumeSales * 0.045;
                }else if(volumeSales > 500 && volumeSales <= 1000){
                    commission = volumeSales * 0.075;
                }else if(volumeSales > 1000 && volumeSales <= 10000){
                    commission = volumeSales * 0.1;
                }else if(volumeSales > 10000){
                    commission = volumeSales * 0.13;
                }
                break;
            case "Plovdiv" :
                if(volumeSales >= 0 && volumeSales <= 500){
                    commission = volumeSales * 0.055;
                }else if(volumeSales > 500 && volumeSales <= 1000){
                    commission = volumeSales * 0.08;
                }else if(volumeSales > 1000 && volumeSales <= 10000){
                    commission = volumeSales * 0.12;
                }else if(volumeSales > 10000){
                    commission = volumeSales * 0.145;
                }
                break;
        }
        if(commission > 0){
            if(city.equals("Sofia") || city.equals("Plovdiv") || city.equals("Varna")){
                System.out.printf("%.2f", commission);
            }
        }else {
            System.out.println("error");
        }
    }

}

