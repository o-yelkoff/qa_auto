package homework.test;

import homework.Student;

public class TestStudent {
    static Student student1 = new Student();

    public static void main(String[] args) {
        student1.setGrade(9);
        student1.setName("Yelkoff");
        student1.setCourse(3);
        student1.showInfo();
    }
}
