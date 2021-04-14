package loops;

/**
 * 1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
 * При решении используйте оперцию инкремента (++).
 */
public class ForLoopExample {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) System.out.print(i + ", ");
        }
    }
}
