package practice08;

import java.util.Scanner;

public class FromAToB {
    public static void printFromAToB(int a, int b) {
        System.out.print(a + " ");

        if (a == b) {
            return;
        }

        if (a < b) {
            printFromAToB(a + 1, b);
        } else {
            printFromAToB(a - 1, b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите A: ");
        int a = scanner.nextInt();

        System.out.print("Введите B: ");
        int b = scanner.nextInt();

        printFromAToB(a, b);
        System.out.println();
    }
}
