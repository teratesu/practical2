package practice10;

public class MergeStudents {
    public static void main(String[] args) {
        Student[] first = {
                new Student("Иван", "Петров", "ИВТ", 2, "ИВТ-21", 4.5),
                new Student("Анна", "Смирнова", "ИВТ", 1, "ИВТ-11", 4.9),
                new Student("Олег", "Кузнецов", "ПИ", 3, "ПИ-31", 3.8)
        };

        Student[] second = {
                new Student("Мария", "Иванова", "ИВТ", 2, "ИВТ-21", 4.2),
                new Student("Павел", "Соколов", "ПИ", 1, "ПИ-11", 4.7),
                new Student("Елена", "Морозова", "ПИ", 3, "ПИ-31", 4.0)
        };

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.sortArray(first);
        sorter.sortArray(second);

        Student[] merged = sorter.merge(first, second);

        System.out.println("Первый список после сортировки:");
        sorter.printArray(first);

        System.out.println();
        System.out.println("Второй список после сортировки:");
        sorter.printArray(second);

        System.out.println();
        System.out.println("Объединенный отсортированный список:");
        sorter.printArray(merged);
    }
}
