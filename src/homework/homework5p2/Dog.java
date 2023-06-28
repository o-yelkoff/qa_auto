package homework.homework5p2;

public class Dog extends Pet {
    public Dog(String name) {
        setName(name);
        System.out.println("I am dog and my name is:" + name);
    }

    public void play() {
        System.out.println("Dog plays");
    }
}
