package homework;

public class Student {
    private String name;
    private Integer course;
    private Integer grade;


    public String getName() {
        return name;
    }

    public void setName(String name1) {
        if (name1.length() > 3) {
            name = name1;
        } else {
            System.out.println("ERROR! The 'name' value should be more then 3 digit");
        }
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course1) {
        if ((course1 > 0) && (course1 < 5)) {
            course = course1;
        } else {
            System.out.println("ERROR! Please enter the valid course value ");
        }
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade1) {
        if ((grade1 > 0) && (grade1 < 11)) {
            grade = grade1;
        } else {
            System.out.println("ERROR! Please enter the valid grade value ");
        }
    }

    public void showInfo() {
        String studentInfo = ("Name:" + getName() + "; Course:" + getCourse() + "; Grade:" + getGrade() + ";");
        System.out.println(studentInfo);
    }

    public static void main(String[] args) {

    }

}
