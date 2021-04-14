package controlstmnts;

import java.util.Scanner;

/**
 * 2. Написать программу для вывода названия поры года по номеру месяца.
 * При решении используйте оператор if-else-if.
 */
public class IfElseOperatorExample {

    public static void main(String[] args) {
        System.out.println("Enter month number");
        int monthNumber = new Scanner(System.in).nextInt();

        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) System.out.println("oh! it is winter!");
            else if (3 <= monthNumber && monthNumber <= 5) System.out.println("oh! it is spring!");
                else if (6 <= monthNumber && monthNumber <= 8) System.out.println("oh! it is summer!");
                    else if (9 <= monthNumber && monthNumber <= 11) System.out.println("oh! it is autumn!");
        else throw new IllegalStateException("Incorrect month number: " + monthNumber);
    }
}
