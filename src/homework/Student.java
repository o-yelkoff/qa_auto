package homework;

public class Student {
    String studentTicketNumber;
    String firstName;
    String lastName;
    int course;
    double gpaFromMath;
    double gpaFromEconomy;
    double gpaFromLanguage;

    public Student(String studentTicketNumber, String firstName, String lastName, int course, double gpaFromMath, double gpaFromEconomy, double gpaFromLanguage) {
        this.studentTicketNumber = studentTicketNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.gpaFromMath = gpaFromMath;
        this.gpaFromEconomy = gpaFromEconomy;
        this.gpaFromLanguage = gpaFromLanguage;
    }

    public static double studentTest(double gpaFromEconomy, double gpaFromLanguage, double gpaFromMath) {
        double gpa;
        gpa = ((gpaFromEconomy + gpaFromLanguage + gpaFromMath) / 3);
        return gpa;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
