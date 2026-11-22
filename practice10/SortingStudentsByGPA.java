package practice10;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    private Student[] iDNumber;

    public void setArray() {
        iDNumber = new Student[]{
                new Student("Иван", "Петров", "ИВТ", 2, "ИВТ-21", 4.5),
                new Student("Анна", "Смирнова", "ИВТ", 1, "ИВТ-11", 4.9),
                new Student("Олег", "Кузнецов", "ПИ", 3, "ПИ-31", 3.8),
                new Student("Мария", "Иванова", "ИВТ", 2, "ИВТ-21", 4.2),
                new Student("Павел", "Соколов", "ПИ", 1, "ПИ-11", 4.7)
        };
    }

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

    public void outArray() {
        printArray(iDNumber);
    }

    public void printArray(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    public void quicksort() {
        quickSort(iDNumber, 0, iDNumber.length - 1);
    }

    public void sortArray(Student[] students) {
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

    public void mergeSort() {
        mergeSort(iDNumber, 0, iDNumber.length - 1);
    }

    private void mergeSort(Student[] students, int low, int high) {
        if (low >= high) {
            return;
        }

        int middle = (low + high) / 2;
        mergeSort(students, low, middle);
        mergeSort(students, middle + 1, high);
        mergeParts(students, low, middle, high);
    }

    private void mergeParts(Student[] students, int low, int middle, int high) {
        Student[] temp = new Student[high - low + 1];
        int i = low;
        int j = middle + 1;
        int k = 0;

        while (i <= middle && j <= high) {
            if (compare(students[i], students[j]) <= 0) {
                temp[k] = students[i];
                i++;
            } else {
                temp[k] = students[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            temp[k] = students[i];
            i++;
            k++;
        }

        while (j <= high) {
            temp[k] = students[j];
            j++;
            k++;
        }

        for (int t = 0; t < temp.length; t++) {
            students[low + t] = temp[t];
        }
    }

    public void sortByLastName() {
        for (int i = 0; i < iDNumber.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < iDNumber.length; j++) {
                if (iDNumber[j].getLastName().compareToIgnoreCase(iDNumber[minIndex].getLastName()) < 0) {
                    minIndex = j;
                }
            }

            Student temp = iDNumber[i];
            iDNumber[i] = iDNumber[minIndex];
            iDNumber[minIndex] = temp;
        }
    }

    public Student[] merge(Student[] first, Student[] second) {
        Student[] result = new Student[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (compare(first[i], second[j]) <= 0) {
                result[k] = first[i];
                i++;
            } else {
                result[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            result[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            result[k] = second[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        sorter.setArray();
        System.out.println("Исходный массив:");
        sorter.outArray();

        sorter.quicksort();
        System.out.println();
        System.out.println("После быстрой сортировки по среднему баллу:");
        sorter.outArray();

        sorter.setArray();
        sorter.mergeSort();
        System.out.println();
        System.out.println("После сортировки слиянием по среднему баллу:");
        sorter.outArray();

        sorter.setArray();
        sorter.sortByLastName();
        System.out.println();
        System.out.println("После сортировки по фамилии:");
        sorter.outArray();
    }
}
