package homework;

public class Employee {
    private double salary;
    public String surname;
    protected int id;


    public Employee (String surname) {
        this.surname = surname;
    }
    private Employee (double salary, String surname,int id) {
        this.id = id;
        this.surname = surname;
        this.salary = salary;
    }
    protected Employee ( String surname, int id) {
        this.surname = surname;
        this.id = id;
    }
    public String getSureName(){
        return surname;
    }

    public int getId(){
        return id;
    }

    public double getSalary(){
        return salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(2000,"Yelkoff", 13);
        System.out.println(employee);
    }
    }
