package practice09;

public class InsertionSort {
    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].compareTo(key) > 0) {
                students[j + 1] = students[j];
                j--;
            }

            students[j + 1] = key;
        }
    }
}
