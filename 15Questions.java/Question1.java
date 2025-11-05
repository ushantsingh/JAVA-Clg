// Check Even or Odd using if-else

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("The Number is Even");
        }
        else {
            System.out.println("The Number is Odd");
        }
    }
}
