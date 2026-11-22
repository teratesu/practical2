package practice09;

public class TestStudents {
    public static void main(String[] args) {
        Student[] students = {
                new Student(103, "Иван", "Петров", 4.5),
                new Student(101, "Анна", "Смирнова", 4.9),
                new Student(105, "Олег", "Кузнецов", 3.8),
                new Student(102, "Мария", "Иванова", 4.2),
                new Student(104, "Павел", "Соколов", 4.7)
        };

        System.out.println("Исходный массив:");
        printStudents(students);

        InsertionSort.insertionSort(students);

        System.out.println();
        System.out.println("После сортировки вставками по номеру студенческого:");
        printStudents(students);
    }

    private static void printStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
