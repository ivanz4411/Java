package ru.mirea.lab1.Homework4_1.Homework4_1_9;

public class sofa extends Furniture{
    private int price;
    public sofa(String type, String material, int price) {
        super(type, material);
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return super.toString()+" цена: "+getPrice();
    }
}