package practice13;

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;

    public Person(String lastName, String firstName, String patronymic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public String getFio() {
        StringBuilder result = new StringBuilder(30);
        result.append(lastName == null ? "" : lastName);

        if (firstName != null && !firstName.isEmpty()) {
            result.append(' ').append(firstName.charAt(0)).append('.');
        }
        if (patronymic != null && !patronymic.isEmpty()) {
            result.append(patronymic.charAt(0)).append('.');
        }

        return result.toString();
    }

    @Override
    public String toString() {
        return getFio();
    }
}
