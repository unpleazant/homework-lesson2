package loops;

/**
 *  5. Вывести 10 первых чисел последовательности 0, -5,-10,-15..
 */
public class SequenceOfTenNumbers {

    public static void main(String[] args) {
        int x = 5;
        for (int i = 0; i < 10; i++) {
            x -= 5;
            System.out.println(x + " ");
        }
    }

}
