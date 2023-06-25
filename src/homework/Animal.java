package homework;

public class Animal {
    int eyes;
    String eat;
    String drink;

    public Animal(int eyes, String eat, String drink) {
        this.eyes = eyes;
        this.eat = eat;
        this.drink = drink;
        System.out.println("I am animal");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    void drink() {
        System.out.println("Animal drink");
    }

}

class Pet extends Animal {
    String name;
    int tail;
    int paw;

    public Pet(int eyes, String eat, String drink, String name, int paw, int tail) {
        super(eyes, eat, drink);
        this.name = name;
        this.paw = paw;
        this.tail = tail;
        System.out.println("I am pet");
    }

    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet jump");
    }

    static class Dog extends Pet {

        public Dog(int eyes, String eat, String drink, String name, int paw, int tail) {
            super(eyes, eat, drink, name, paw, tail);
            System.out.println("I am dog and my name is:" + name);
        }

        void play() {
            System.out.println("Dog plays");
        }
    }

    static class Cat extends Pet {

        public Cat(int eyes, String eat, String drink, String name, int paw, int tail) {
            super(eyes, eat, drink, name, paw, tail);
            System.out.println("I am cat and my name is:" + name);
        }

        void sleep() {
            System.out.println("Cat sleeps");
        }

        @Override
        void jump() {
            System.out.println("Cat jump");
        }
    }

    public static class Test {
        public static void main(String[] args) {
            Cat cat1 = new Cat(2, "yes", "yes", "Gav", 4, 1);
            Dog dog1 = new Dog(2, "yes", "yes", "Bumer", 4, 1);
            System.out.println("The dog pow quantity is " + dog1.paw);
            cat1.sleep();
        }
    }
}
