package ru.mirea.lab1.Homework4_1.Homework4_1_1;

public class Rectangle extends Shape{

    private String Type;
    private int area;
    private int perimeter;

    public Rectangle(String Type,int area, int perimeter) {

        super(Type,area,perimeter);

    }

    @Override
    public String getType() {
        return Type;
    }

    @Override
    public int getArea() {
        return area;
    }

    @Override
    public int getPerimeter() {
        return perimeter;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
