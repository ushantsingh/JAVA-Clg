/*Create a class Laptop with brand, RAM, and price. Add a constructor to initialize values and a
method to display them. */

class Laptop {
    String brand;
    int ram;
    double price;

    Laptop(String bra, int r, int pri) {
        this.brand = bra;
        this.ram = r;
        this.price = pri;
        System.out.println("--------  Laptop Details -------");
        System.out.println("Brand : "+bra+"\n"+"Ram : "+r+"\n"+"Price : "+pri);
    }
}

public class Question {
    public static void main(String[] args) {
        Laptop l = new Laptop("Apple", 16, 82000);
    }
}
