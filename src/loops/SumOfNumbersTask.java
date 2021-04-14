package loops;

import java.util.Scanner;

/**
 * 3. Напишите программу, где пользователь вводит любое целое положительное число,
 * a программа суммирует все числа от 1 до введенного пользователем числа.
 * Для ввода числа воспользуйтесь классом Scanner.
 */
public class SumOfNumbersTask {

    public static void main(String[] args) {
        System.out.println("Enter integer value");
        int value = new Scanner(System.in).nextInt();
        if (value < 0) throw new Error("the value must be positive");
        int j = 0;
        for (int i = 1; i <= value; i++) j += i;
        System.out.println("the sum of numbers from 1 to " + value + " = " + j);
    }

}
