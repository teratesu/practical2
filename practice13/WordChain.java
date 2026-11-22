package practice13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordChain {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();

        System.out.println(getLine(fileName));
    }

    public static String getLine(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        StringBuilder text = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            text.append(line).append(' ');
        }
        reader.close();

        String[] words = text.toString().trim().split("\\s+");
        boolean[] used = new boolean[words.length];
        StringBuilder result = new StringBuilder();
        int current = 0;

        used[0] = true;
        result.append(words[0]);

        for (int step = 1; step < words.length; step++) {
            char lastLetter = Character.toLowerCase(words[current].charAt(words[current].length() - 1));
            int next = -1;

            for (int i = 0; i < words.length; i++) {
                if (!used[i] && Character.toLowerCase(words[i].charAt(0)) == lastLetter) {
                    next = i;
                    break;
                }
            }

            if (next == -1) {
                break;
            }

            used[next] = true;
            result.append(' ').append(words[next]);
            current = next;
        }

        return result.toString();
    }
}
