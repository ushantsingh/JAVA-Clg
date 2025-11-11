/*Create a class Rectangle with length and breadth as fields. Add methods to calculate area and
perimeter. Create objects with different values and call those methods. */


class Rectangle {
    double length;
    double breadth;

    void Area(double l, double b) {
        this.length = l;
        this.breadth = b;
        double c = l * b;
        System.out.println(c);
    }
}

public class Question_2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.Area(3, 4);
    }
}
