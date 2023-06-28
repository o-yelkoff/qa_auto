package homework.test;

import homework.homework5p2.Cat;
import homework.homework5p2.Dog;
import homework.homework5p2.Pet;

public class Animaltest {
    public static void main(String[] args) {
        Dog newDog = new Dog("Bumer");
        Cat newCat = new Cat("Gav");
        System.out.println("The dog has " + newDog.getPaw() + " paws;");
        newCat.sleep();
    }
}
