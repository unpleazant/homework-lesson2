package controlstmnts;

import java.util.Scanner;

public class TernaryOperatorExample {

    /**
     * 3. Напишите программу которая будет принимать на вход число
     * и на выход будет выводить сообщение четное число или нет.
     * Для определения четности числа используйет операцию получения остатка от деления - операция выглядит так: '% 2').
     */
    public static void main(String[] args) {
        System.out.println("Enter integer value");
        int value = new Scanner(System.in).nextInt();
        System.out.println("Entered value is " + ((value % 2 == 0) ? "even" : "odd"));
    }

}
