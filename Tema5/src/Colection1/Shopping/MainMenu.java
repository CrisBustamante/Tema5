package Colection1.Shopping;

import static Colection1.Shopping.ShoppingFunctions.*;

import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean close = false;
        System.out.println("SHOPPING MANAGE SYSTEM:");
        while(!close) {
            showMenu();
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println("""
                        -----------------------------------------------
                        1 : ADD PRODUCT TO THE SHOPPING LIST:
                        INSERT PRODUCT:\s""");
                    addProductToList(scanner.nextLine().trim());
                    System.out.println("-----------------------------------------------");
                    break;
                case 2:
                    System.out.println("""
                        -----------------------------------------------
                        2 : MOVE PRODUCTS TO SHOPPING CART:
                        ENTER PRODUCT TO MOVE IT TO THE SHOPPING CART: (TYPE END TO FINISH)
                        """);
                    moveProductsToCart();
                    System.out.println("-----------------------------------------------");
                    break;
                case 3:
                    System.out.println("""
                        -----------------------------------------------
                        3 : ADD PRODUCTS TO CART:
                        INSERT PRODUCT:
                        """);
                    addProductsToCart(scanner.nextLine().trim());
                    System.out.println("-----------------------------------------------");
                    break;
                case 4:
                    System.out.println("""
                        -----------------------------------------------
                        4 : VIEW MISSING PRODUCTS IN CART:
                        """);
                    viewMissingProducts();
                    break;
                case 5:
                    System.out.println("""
                        -----------------------------------------------
                        5 : VIEW SHOPPING LIST:
                        """);
                    viewProducts(shoppingList);
                    break;
                case 6:
                    System.out.println("""
                        -----------------------------------------------
                        6 : VIEW SHOPPING CART:
                        """);
                    viewProducts(shoppingCart);
                    break;
                case 7:
                    System.out.println("BYE!");
                    close = true;
                    break;
                default:
                    System.out.println("INVALID OPTION. TRY AGAIN.");
            }
        }
    }

    public static void showMenu() {
        System.out.println("""
            MAIN MENU
            -----------------------------------------------
            INSERT THE NUMBER OF THE TASK YOU WANT TO PERFORM:
             1 : ADD PRODUCT TO THE SHOPPING LIST.
             2 : MOVE PRODUCTS TO SHOPPING CART.
             3 : ADD PRODUCTS TO CART.
             4 : VIEW MISSING PRODUCTS IN CART.
             5 : VIEW SHOPPING LIST.
             6 : VIEW SHOPPING CART.
             7 : EXIT.
            -----------------------------------------------
            """);
    }
}