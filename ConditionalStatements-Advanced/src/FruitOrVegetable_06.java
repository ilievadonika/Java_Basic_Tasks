import java.util.Scanner;

public class FruitOrVegetable_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();

            //"fruit" са banana, apple, kiwi, cherry, lemon и grapes
            if(product.equals("banana") || product.equals("apple") ||
            product.equals("kiwi") || product.equals("cherry") ||
            product.equals("lemon") || product.equals("grapes")){
                System.out.println("fruit");
                //tomato, cucumber, pepper и carrot
            }else if(product.equals("tomato") || product.equals("cucumber") ||
            product.equals("pepper") || product.equals("carrot")){
                System.out.println("vegetable");
            }else {
                System.out.println("unknown");
            }

    }
}
