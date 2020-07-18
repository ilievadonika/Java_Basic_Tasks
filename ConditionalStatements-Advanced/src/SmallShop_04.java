import java.util.Scanner;

public class SmallShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double price = 0;

        switch (city){
            case "Sofia":
                if(product.equals("coffee")){
                    price = amount * 0.50;
                }else if(product.equals("water")){
                    price = amount * 0.80;
                }else if(product.equals("beer")){
                    price = amount * 1.20;
                }else if(product.equals("sweets")){
                    price = amount * 1.45;
                }else if(product.equals("peanuts")){
                    price = amount * 1.60;
                }
                break;
            case "Plovdiv":
                if(product.equals("coffee")){
                    price = amount * 0.40;
                }else if(product.equals("water")){
                    price = amount * 0.70;
                }else if(product.equals("beer")){
                    price = amount * 1.15;
                }else if(product.equals("sweets")){
                    price = amount * 1.30;
                }else if(product.equals("peanuts")){
                    price = amount * 1.50;
                }
                break;
            case "Varna":
                if(product.equals("coffee")){
                    price = amount * 0.45;
                }else if(product.equals("water")){
                    price = amount * 0.70;
                }else if(product.equals("beer")){
                    price = amount * 1.10;
                }else if(product.equals("sweets")){
                    price = amount * 1.35;
                }else if(product.equals("peanuts")) {
                    price = amount * 1.55;
                }
                break;
        }
        System.out.printf("%.2f", price);
    }
}
