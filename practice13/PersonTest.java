package practice13;

public class PersonTest {
    public static void main(String[] args) {
        Person full = new Person("Смирнова", "Анна", "Петровна");
        Person withoutPatronymic = new Person("Иванов", "Иван", null);
        Person onlyLastName = new Person("Петров", null, null);

        System.out.println(full.getFio());
        System.out.println(withoutPatronymic.getFio());
        System.out.println(onlyLastName.getFio());
    }
}
