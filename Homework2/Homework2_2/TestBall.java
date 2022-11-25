package ru.mirea.lab1.Homework2.Homework2_2;
import ru.mirea.lab1.Homework2.Homework2_2.Ball;
import java.util.Scanner;

public class TestBall {

    public static void main(String[] args) {
        Ball ball = new Ball (10,10);
        System.out.println(ball);
        ball.move(15, 27);
        System.out.println(ball);

    }

}
