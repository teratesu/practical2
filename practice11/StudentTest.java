package practice11;

import java.text.DateFormat;
import java.util.Calendar;

public class StudentTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2005, Calendar.MARCH, 14, 0, 0, 0);

        Student student = new Student("Анна", "Смирнова", calendar.getTime());

        System.out.println(student);
        System.out.println("Короткий формат: " + student.getBirthDateString(DateFormat.SHORT));
        System.out.println("Средний формат: " + student.getBirthDateString(DateFormat.MEDIUM));
        System.out.println("Полный формат: " + student.getBirthDateString(DateFormat.FULL));
    }
}
