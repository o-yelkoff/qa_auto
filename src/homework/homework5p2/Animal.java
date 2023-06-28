package homework.homework5p2;

public class Animal {
    private int eyes;
    private String eat;
    private String drink;

    public int getEyes() {
        return eyes;
    }

    protected void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

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
