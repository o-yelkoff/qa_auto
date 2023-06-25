package homework;

public class Animal {
    int eyes;
    String eat;
    String drink;

    public Animal() {
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

    public Pet() {
        eyes = 2;
        tail = 1;
        paw =4;
        System.out.println("I am pet");
    }

    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet jump");
    }

    static class Dog extends Pet {
        public Dog(String name) {
            this.name = name;
            System.out.println("I am dog and my name is:" + name);
        }
        void play() {
            System.out.println("Dog plays");
        }
    }

    static class Cat extends Pet {
        public Cat(String name) {
            this.name = name;
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
            Cat cat1 = new Cat("Gav");
            Dog dog1 = new Dog("Bumer");
            System.out.println("The dog pow quantity is " + dog1.paw);
            cat1.sleep();
        }
    }
}
