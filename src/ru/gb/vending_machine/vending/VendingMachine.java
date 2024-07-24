package ru.gb.vending_machine.vending;

import ru.gb.vending_machine.products.Product;

public interface VendingMachine {
    Product getProduct(String name, int volume, int temperature);
}
