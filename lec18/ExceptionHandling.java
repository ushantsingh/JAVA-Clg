

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

        try {
            int arr[] = { 1, 2, 3, 4 };
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            String str = null;
            System.out.println(str);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        // int a = 5;
        // int b = 0;
        // int c = a / b;
        // System.out.println(c);
        System.out.println("Byee");
    }
}
