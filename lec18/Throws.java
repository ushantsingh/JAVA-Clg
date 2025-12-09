
public class Throws {
    public static void main(String[] args) {
        try {
            riskyMetod();
        } catch (Exception e) {
            System.out.println("msin mai handle hua: " + e);
        }
        System.out.println("Program Continue...");
    }

    static void riskyMetod() throws ArithmeticException {
        System.out.println("riskyMethod start");
        int result = 10 / 0;
        System.out.println("Result " + result);
        System.out.println("Program end...");
    }
}
