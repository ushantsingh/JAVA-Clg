

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Hello");
        try {
            int a = 5;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }
        // int a = 5;
        // int b = 0;
        // int c = a / b;
        // System.out.println(c);
        System.out.println("Byee");
    }
}
