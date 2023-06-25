package homework.homework5p2;

public class Cat extends Pet {
    public Cat(String name) {
        setName(name);
        System.out.println("I am cat and my name is:" + name);
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }

}

