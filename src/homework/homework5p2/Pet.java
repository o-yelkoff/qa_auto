package homework.homework5p2;

public class Pet extends Animal {
    private String name;
    private int tail;
    private int paw;

    public String getName() {
        return name;
    }

    public int getTail() {
        return tail;
    }

    public int getPaw() {
        return paw;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet() {
        setEyes(2);
        tail = 1;
        paw = 4;
        System.out.println("I am pet");
    }

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet jump");
    }
}
