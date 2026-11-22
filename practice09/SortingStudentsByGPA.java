package practice09;


import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        if (first.getGpa() < second.getGpa()) {
            return 1;
        }
        if (first.getGpa() > second.getGpa()) {
            return -1;
        }
        return 0;
    }

    public void quickSort(Student[] students) {
        quickSort(students, 0, students.length - 1);
    }

    private void quickSort(Student[] students, int low, int high) {
        if (low >= high) {
            return;
        }

        int i = low;
        int j = high;
        Student pivot = students[(low + high) / 2];

        while (i <= j) {
            while (compare(students[i], pivot) < 0) {
                i++;
            }
            while (compare(students[j], pivot) > 0) {
                j--;
            }
            if (i <= j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
        }

        quickSort(students, low, j);
        quickSort(students, i, high);
    }

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

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students);

        System.out.println();
        System.out.println("После быстрой сортировки по среднему баллу (по убыванию):");
        printStudents(students);
    }

    private static void printStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
