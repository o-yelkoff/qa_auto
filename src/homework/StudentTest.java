package homework;

public class StudentTest {
    static Student student1 = new Student("XX123BB", "Alex", "Yelkoff", 2, 2.9, 2.9, 2.9);
    static Student student2 = new Student("XX123BB", "Dmytro", "Lytcenko", 2, 4.0, 3.7, 5);
    static Student student3 = new Student("XX123BB", "Vitalii", "Nemudrui", 2, 4.5, 3.5, 4.5);

    public static double studentAveregeValue(Student student){
        return ((student.gpaFromEconomy+student.gpaFromMath+student.gpaFromLanguage)/3);
    }

    public static void main(String[] args) {
        double a1 = studentAveregeValue(student1);
        double a2 = studentAveregeValue(student2);
        double a3 = studentAveregeValue(student3);

        System.out.println("The student " + student1 + " has everedge value " + a1);
        System.out.println("The student " + student2 + " has everedge value " + a2);
        System.out.println("The student " + student3 + " has everedge value " + a3);

    }
}
