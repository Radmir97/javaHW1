package ru.gb.vending_machine.vending;

import ru.gb.vending_machine.products.HotDrink;
import ru.gb.vending_machine.products.Product;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private List<HotDrink> hotDrinks;

    public HotDrinkVendingMachine() {
        this.hotDrinks = new ArrayList<>();
    }

    public void addHotDrink(HotDrink hotDrink) {
        hotDrinks.add(hotDrink);
    }

    @Override
    public HotDrink getProduct(String name, int volume, int temperature) {
        for (HotDrink hotDrink : hotDrinks) {
            if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature) {
                return hotDrink;
            }
        }
        return null;
    }
}
