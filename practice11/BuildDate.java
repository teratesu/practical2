package practice11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class BuildDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Введите число: ");
        int day = scanner.nextInt();
        System.out.print("Введите часы: ");
        int hours = scanner.nextInt();
        System.out.print("Введите минуты: ");
        int minutes = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hours, minutes, 0);
        calendar.set(Calendar.MILLISECOND, 0);

        Date date = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");

        System.out.println();
        System.out.println("Объект Calendar: " + format.format(calendar.getTime()));
        System.out.println("Объект Date: " + format.format(date));
    }
}
