package com.pointofsale;

import java.util.ArrayList;
import java.util.Scanner;

public class PointOfSale {
    private static boolean isPointOfSaleActive = true;
    static ArrayList<String> shoppingCart=new ArrayList<>();

    public static void scan() {
        Scanner userInput = new Scanner(System.in);

        boolean isCorrect = false;
        String input = userInput.nextLine();

        if ("quit".equalsIgnoreCase(input)) {
            isPointOfSaleActive = false;
            printShoppingCart();
        } else if (input.isBlank()) {
            System.out.println("Invalid bar-code");
        } else {
            for (Products product : Products.values()) {
                if (product.toString().equalsIgnoreCase(input)) {
                    System.out.println(product + " added to cart, price: $" + product.price);
                    isCorrect = true;
                    shoppingCart.add(product.toString()+", $"+product.price);
                }
            }
            if (!isCorrect) {
                System.out.println("Product not found");
            }
        }
    }

    public static boolean isActive() {
        return isPointOfSaleActive;
    }

    private static void printShoppingCart(){
        System.out.println("Here is receipt:");
        shoppingCart.stream()
                    .forEach(System.out::println);
    }

    private enum Products {
        ORANGE(3.5f),
        BANANA(2.5f),
        POTATO(0.3f),
        APPLE(1.7f),
        CHERRIES(0.5f),
        LEMON(2.1f);

        float price;

        Products(float priceConstructor) {
            price = priceConstructor;
        }

        @Override
        public String toString() {
            return super.toString().toLowerCase();
        }
    }

}
