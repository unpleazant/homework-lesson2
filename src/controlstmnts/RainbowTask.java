package controlstmnts;

import java.util.Scanner;

/**
 * 5. По введенному номеру определить цвет радуги
 * (1 – красный, 4 – зеленый и т. д.)
 */
public class RainbowTask {

    public static void main(String[] args) {
        System.out.println("Enter color number");
        int colorValue = new Scanner(System.in).nextInt();

        switch (colorValue) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Blue");
                break;
            case 6:
                System.out.println("Purple");
                break;
            case 7:
                System.out.println("Pink");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + colorValue);
        }
    }
}