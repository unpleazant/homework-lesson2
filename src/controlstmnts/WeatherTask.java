package controlstmnts;

import java.util.Scanner;
/**
 *   4. Для введенного числа t (температура на улице) вывести
 *   Если t>–5, то вывести «Тепло».
 *   Если –5>= t > –20, то вывести «Нормально».
 *   Если –20>= t, то вывести «Холодно».
 */
public class WeatherTask {

    public static void main(String[] args) {
        System.out.println("Enter temperature value");
        int temperature = new Scanner(System.in).nextInt();

        if (-5 < temperature) System.out.println("Its warm outside");
        if (-20 < temperature && temperature <= -5) System.out.println("Its normal temperature");
        if (temperature <= -20) System.out.println("Its too cold");
    }
}