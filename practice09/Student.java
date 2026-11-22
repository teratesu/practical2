package practice09;

public class Student implements Comparable<Student> {
    private int idNumber;
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(int idNumber, String firstName, String lastName, double gpa) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student other) {
        if (idNumber < other.idNumber) {
            return -1;
        }
        if (idNumber > other.idNumber) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student[id=" + idNumber + ", " + firstName + " " + lastName + ", gpa=" + gpa + "]";
    }
}
