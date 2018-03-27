package com.donny.templatemethod8.coffeetea;

public class BeverageTestDrive {
        public static void main(String[] args) {
            CoffeeWithHook coffeeHook = new CoffeeWithHook();

            System.out.println("\nMaking coffee...");
            coffeeHook.prepareRecipe();
        }
}
