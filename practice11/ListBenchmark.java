package practice11;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListBenchmark {
    private static final int N = 100_000;
    private static final int OPERATIONS = 500;

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Сравнение ArrayList и LinkedList, N = " + N);
        System.out.printf("%-30s%18s%18s%n", "Операция", "ArrayList, мс", "LinkedList, мс");

        long start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            arrayList.add(i);
        }
        double arrayAdd = (System.nanoTime() - start) / 1_000_000.0;

        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            linkedList.add(i);
        }
        double linkedAdd = (System.nanoTime() - start) / 1_000_000.0;

        System.out.printf("%-30s%18.3f%18.3f%n", "Добавление в конец", arrayAdd, linkedAdd);

        start = System.nanoTime();
        for (int i = 0; i < OPERATIONS; i++) {
            arrayList.add(arrayList.size() / 2, -1);
        }
        double arrayInsert = (System.nanoTime() - start) / 1_000_000.0;

        start = System.nanoTime();
        for (int i = 0; i < OPERATIONS; i++) {
            linkedList.add(linkedList.size() / 2, -1);
        }
        double linkedInsert = (System.nanoTime() - start) / 1_000_000.0;

        System.out.printf("%-30s%18.3f%18.3f%n", "Вставка в середину", arrayInsert, linkedInsert);

        start = System.nanoTime();
        for (int i = 0; i < OPERATIONS; i++) {
            arrayList.remove(arrayList.size() / 2);
        }
        double arrayRemove = (System.nanoTime() - start) / 1_000_000.0;

        start = System.nanoTime();
        for (int i = 0; i < OPERATIONS; i++) {
            linkedList.remove(linkedList.size() / 2);
        }
        double linkedRemove = (System.nanoTime() - start) / 1_000_000.0;

        System.out.printf("%-30s%18.3f%18.3f%n", "Удаление из середины", arrayRemove, linkedRemove);

        start = System.nanoTime();
        for (int i = 0; i < OPERATIONS; i++) {
            arrayList.indexOf(N - 1);
        }
        double arraySearch = (System.nanoTime() - start) / 1_000_000.0;

        start = System.nanoTime();
        for (int i = 0; i < OPERATIONS; i++) {
            linkedList.indexOf(N - 1);
        }
        double linkedSearch = (System.nanoTime() - start) / 1_000_000.0;

        System.out.printf("%-30s%18.3f%18.3f%n", "Поиск последнего элемента", arraySearch, linkedSearch);
    }
}
