// Check whether a number is a multiple of 3 or not using if-else

import java.util.Scanner;

public class Questoin10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();

        if (n % 3 == 0) {
            System.out.println("The Number is Devisible by 3");
        }
        else {
            System.out.println("The Number is not Divisible by 3");
        }
    }
}
