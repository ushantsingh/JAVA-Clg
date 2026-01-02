/*Create a class Circle with radius. Write methods to calculate area and circumference of the circle */

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;

    }
}


public class Question_5 {
    public static void main(String[] args) {
        Circle c = new Circle(4);
        System.out.println("Area : "+c.area());
        System.out.println("Circumference : "+c.circumference());
    }
}
