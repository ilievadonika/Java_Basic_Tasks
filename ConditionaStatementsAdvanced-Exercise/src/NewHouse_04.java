import java.util.Scanner;

public class NewHouse_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        int finance = Integer.parseInt(scanner.nextLine());

        double singlePrice = 0;

        switch (flower){
            case "Roses" :
                singlePrice = 5;
                break;
            case "Dahlias" :
                singlePrice = 3.8;
                break;
            case "Tulips" :
                singlePrice = 2.8;
                break;
            case "Narcissus" :
                singlePrice = 3;
                break;
            case "Gladiolus" :
                singlePrice = 2.5;
                break;
        }
        double total = number * singlePrice;

    //	Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
    //	Ако Нели купи повече от 90  Далии - 15% отстъпка от крайната цена
    //	Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
    //	Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
    //	Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%
        if(number > 80 && flower.equals("Roses")){
            total = total * 0.9;
        }else if(number > 90 && flower.equals("Dahlias")){
            total = total * 0.85;
        }else if(number > 80 && flower.equals("Tulips")){
            total = total * 0.85;
        }else if(number < 120 && flower.equals("Narcissus")){
            total = total * 1.15;
        }else if(number < 80 && flower.equals("Gladiolus")){
            total = total * 1.20;
        }

        if(finance >= total){
            double moneyLeft = finance - total;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", number, flower, moneyLeft);
        }else {
            double moneyNeed = total - finance;
            System.out.printf("Not enough money, you need %.2f leva more.", moneyNeed);
        }

    }
}
