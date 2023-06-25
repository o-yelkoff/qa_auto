package homework;

public class TestStudent {
    static Student student1 = new Student();

    public static void main(String[] args) {
        student1.setGrade(5);
        student1.setName("Ye");
        student1.setCourse(0);
        student1.showInfo();
    }
}
