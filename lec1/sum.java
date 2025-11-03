import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        // int a = 123;
        // int b;
        // int rem=0;
        // for (int i = 0; i < 3; i++) {
        // b = a % 10;
        // rem += b;

        // }
        // byte a = 6;
        // byte b = 4;
        // byte c = (byte) (a + b);
        // System.out.println(c);

        // byte a = 5;
        // int b = a;
        // System.out.println(b);

        // int a = 6;
        // short b = (short) a;
        // System.out.println(b);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        System.out.println(a);
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
