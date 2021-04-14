package controlstmnts;

import java.util.Scanner;

/**
 * 1. Написать программу для вывода названия поры года по номеру месяца.
 * При решении используйте оператор switch-case.
 */
public class SwitchOperatorExample {

    public static void main(String[] args) {
        System.out.println("Enter month number");
        int monthNumber = new Scanner(System.in).nextInt();

        switch (monthNumber) {
            case 12: case 1: case 2:
                System.out.println("oh! it is winter!");
                break;
            case 3: case 4: case 5:
                System.out.println("oh! it is spring!");
                break;
            case 6: case 7: case 8:
                System.out.println("oh! it is summer!");
                break;
            case 9: case 10: case 11:
                System.out.println("oh! it is autumn!");
                break;
            default:
                throw new IllegalStateException("Incorrect month number: " + monthNumber);
        }
    }
}