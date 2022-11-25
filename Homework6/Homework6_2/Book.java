package ru.mirea.lab1.Homework6.Homework6_2;

public class Book implements Printable{
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
            System.out.println("Книга: "+name );

    }
}
