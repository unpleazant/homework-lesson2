package loops;

/**
 *   4. Необходимо, чтоб программа выводила на экран вот такую последовательность:
 *   7 14 21 28 35 42 49 56 63 70 77 84 91 98.
 *   В решении используйте цикл while.
 */
public class WhileLoopExample {

    public static void main(String[] args) {
        int x = 0;
        while (true) {
            x += 7;
            if (x > 100) break;
            System.out.print(x + " ");
        }
    }
}
