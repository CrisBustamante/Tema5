package Colection1.Shopping;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ShoppingFunctions {

    static Scanner scanner = new Scanner(System.in);
    public static final Set<String> shoppingList = new HashSet<>();
    public static final Set<String> shoppingCart = new HashSet<>();

    public static void addProductToList(String product) {
        shoppingList.add(product);
        System.out.println("PRODUCT ADDED TO SHOPPING LIST.");
    }

    public static void moveProductsToCart() {
        String product = scanner.nextLine().trim();

        while (!product.equalsIgnoreCase("END")) {
            if (shoppingList.contains(product)) {
                shoppingList.remove(product);
                shoppingCart.add(product);
                System.out.println(product + " MOVED TO THE SHOPPING CART.");
            } else if (shoppingCart.contains(product)) {
                System.out.println(product + " IS ALREADY IN THE SHOPPING CART.");
            } else {
                System.out.println(product + " IS NOT IN THE SHOPPING LIST.");
            }

            System.out.println("ENTER PRODUCT TO MOVE IT TO THE SHOPPING CART: (TYPE END TO FINISH)");
            product = scanner.nextLine().trim();
        }
    }

    public static void addProductsToCart(String product) {
        shoppingCart.add(product);
        System.out.println(product + " ADDED TO SHOPPING CART.");
    }

    public static void viewMissingProducts() {
        Set<String> missingProducts = new HashSet<>(shoppingList);
        missingProducts.removeAll(shoppingCart);
        viewProducts(missingProducts);
    }

    public static void viewProducts(Set<String> products) {
        if (products.isEmpty()) {
            System.out.println("ALL PRODUCTS ADDED.");
        } else {
            for (String product : products) {
                System.out.println("- " + product);
            }
        }
    }
}
