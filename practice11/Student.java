package practice11;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Student {
    private String firstName;
    private String lastName;
    private Date birthDate;

    public Student(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getBirthDateString(int style) {
        DateFormat dateFormat = DateFormat.getDateInstance(style, new Locale("ru"));
        return dateFormat.format(birthDate);
    }

    @Override
    public String toString() {
        return "Student[" + firstName + " " + lastName
                + ", дата рождения: " + getBirthDateString(DateFormat.MEDIUM) + "]";
    }
}
