package homework.test;

import homework.Student_hw5;

public class TestStudent {
    static Student_hw5 studentHw51 = new Student_hw5();

    public static void main(String[] args) {
        studentHw51.setGrade(9);
        studentHw51.setName("Yelkoff");
        studentHw51.setCourse(3);
        studentHw51.showInfo();
    }
}
