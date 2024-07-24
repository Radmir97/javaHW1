package ru.gb.vending_machine;

import ru.gb.vending_machine.products.HotDrink;
import ru.gb.vending_machine.vending.HotDrinkVendingMachine;

public class Main {
    public static void main(String[] args) {
        HotDrink coffee = new HotDrink("Coffee", 200, 75);
        HotDrink tea = new HotDrink("Tea", 150, 80);
        HotDrink hotChocolate = new HotDrink("Hot Chocolate", 250, 85);

        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.addHotDrink(coffee);
        vendingMachine.addHotDrink(tea);
        vendingMachine.addHotDrink(hotChocolate);

        HotDrink requestedDrink = vendingMachine.getProduct("Tea", 150, 80);
        if (requestedDrink != null) {
            System.out.println("Dispensing: " + requestedDrink);
        } else {
            System.out.println("Drink not found.");
        }
    }
}
