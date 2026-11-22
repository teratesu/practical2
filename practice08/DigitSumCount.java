package practice08;

import java.util.Scanner;

public class DigitSumCount {
    public static long countNumbers(int k, int sum) {
        return count(k, sum, true);
    }

    private static long count(int digitsLeft, int sumLeft, boolean firstDigit) {
        if (sumLeft < 0) {
            return 0;
        }

        if (digitsLeft == 0) {
            if (sumLeft == 0) {
                return 1;
            }
            return 0;
        }

        long total = 0;
        int start = firstDigit ? 1 : 0;

        for (int digit = start; digit <= 9; digit++) {
            total += count(digitsLeft - 1, sumLeft - digit, false);
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество цифр k: ");
        int k = scanner.nextInt();

        System.out.print("Введите нужную сумму цифр s: ");
        int sum = scanner.nextInt();

        System.out.println("Количество чисел: " + countNumbers(k, sum));
    }
}
