package homework.homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Products {
    private String name;
    private String color;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Products(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Products product1 = new Products("Subaru", null, 35000);
        Products product2 = new Products("Infinyti", "black", 48000);
        Products product3 = new Products("BMW", "silver", 65000);

        List<Products> carsList = List.of(product1, product2, product3);
        List<Products> allcars = carsList.stream().collect(Collectors.toList());
        System.out.println(allcars);
        List<Products> carSallary = carsList.stream().filter(products -> products.getPrice() > 49000).collect(Collectors.toList());
        System.out.println(carSallary);
        List<Products> carsWithColor = carsList.stream().filter(products -> products.getColor() != null).collect(Collectors.toList());
        System.out.println(carsWithColor);
    }
}
