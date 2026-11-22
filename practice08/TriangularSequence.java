package practice08;

import java.util.Scanner;

public class TriangularSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите n: ");
        int n = scanner.nextInt();

        int number = 1;
        int remaining = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(number + " ");
            remaining--;

            if (remaining == 0) {
                number++;
                remaining = number;
            }
        }

        System.out.println();
    }
}
