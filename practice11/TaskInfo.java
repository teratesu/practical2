package practice11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TaskInfo {
    public static void main(String[] args) {
        String developer = "Петров А.В.";

        Calendar calendar = Calendar.getInstance();
        calendar.set(2026, Calendar.NOVEMBER, 10, 9, 0, 0);
        Date received = calendar.getTime();

        Date submitted = new Date();

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Фамилия разработчика: " + developer);
        System.out.println("Дата и время получения задания: " + format.format(received));
        System.out.println("Дата и время сдачи задания: " + format.format(submitted));
    }
}
