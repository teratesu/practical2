package practice08;

import java.util.Scanner;

public class SequenceMax {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int maxSequence() {
        int number = SCANNER.nextInt();

        if (number == 0) {
            return 0;
        }

        int max = maxSequence();

        if (number > max) {
            return number;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("Введите последовательность натуральных чисел, завершающуюся нулем:");
        System.out.println("Максимум последовательности: " + maxSequence());
    }
}
