package ru.mirea.lab1.Homework11.Part2;

public class main {
    public static void main(String[] args) throws InterruptedException {

        TimeCode timeCode = new TimeCode();
        timeCode.timeAdd("!");
        System.out.println();
        timeCode.timeFind("!");
        System.out.println();
        timeCode.timeInsert(2, "bad");
        System.out.println();
        timeCode.timeDelete("!");

    }
}
