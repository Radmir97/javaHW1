package ru.gb.vending_machine.products;

public class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{name='" + getName() + "', volume=" + getVolume() + ", temperature=" + temperature + "}";
    }
}
