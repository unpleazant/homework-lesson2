package loops;

/**
 * 6. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно
 */
public class Square {

    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        for (int i = 10; i <= 20; i++) System.out.print(square(i) + " ");
    }

}
