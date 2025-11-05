// Find Greatest of Two Numbers using if-else

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int a = sc.nextInt();
        System.out.println("Enter Second Number :");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("First Number is Greater!");
        }
        else {
            System.out.println("Second Number is Greater");
        }
    }
}
