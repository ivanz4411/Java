package ru.mirea.lab1.Homework26.Homework26_1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> student = new HashMap<Integer, String>(); // Map - это коллекция, содержащая пары ключ + значение

        student.put(7,"Заволокин Иван");
        student.put(2,"Бедрединов Роман");
        student.put(1,"Азарян Давид");

        System.out.println(student.get(7)); // Получаем имя элемента по ключу
        student.remove(7); //Удаляем элемент по ключу
        System.out.println(student.get(7)); // Проверяем, что элемент был удален

    }
}
