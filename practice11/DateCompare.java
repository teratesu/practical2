package practice11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

        System.out.print("Введите дату в формате дд.мм.гггг: ");
        String input = scanner.nextLine();

        try {
            Date userDate = format.parse(input);
            Date now = new Date();

            System.out.println("Текущая дата: " + format.format(now));
            System.out.println("Введенная дата: " + format.format(userDate));

            if (userDate.after(now)) {
                System.out.println("Введенная дата находится в будущем.");
            } else if (userDate.before(now)) {
                System.out.println("Введенная дата находится в прошлом.");
            } else {
                System.out.println("Введенная дата совпадает с текущей.");
            }
        } catch (ParseException e) {
            System.out.println("Ошибка: дата введена в неверном формате.");
        }
    }
}
