package practice09;

import java.util.Arrays;

public class BookTest {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Мастер и Маргарита", "Булгаков", 1967),
                new Book("Преступление и наказание", "Достоевский", 1866),
                new Book("Война и мир", "Толстой", 1869),
                new Book("Анна Каренина", "Толстой", 1878)
        };

        System.out.println("До сортировки:");
        for (Book book : books) {
            System.out.println(book);
        }

        Arrays.sort(books);

        System.out.println();
        System.out.println("После сортировки (по году издания, затем по названию):");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
