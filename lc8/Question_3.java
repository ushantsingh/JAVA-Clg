
class Shape {
    void Draw() {
        System.out.println("Draws");
    }
}

class Circle extends Shape {
    void CalculateArea() {
        System.out.println("Area : 45 sq");
    }
}


public class Question_3 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.CalculateArea();
        c.Draw();
    }
}
