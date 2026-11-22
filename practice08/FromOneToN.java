package practice08;

import java.util.Scanner;

public class FromOneToN {
    public static void printFromOneToN(int n) {
        if (n < 1) {
            return;
        }

        printFromOneToN(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите n: ");
        int n = scanner.nextInt();

        printFromOneToN(n);
        System.out.println();
    }
}
