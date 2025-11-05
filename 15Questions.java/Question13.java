// Write a program to reverse a number using while loop

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();

        int digit = 0;
        int rev=0;
        while (n > 0) {
            digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println("Revrsed Number :");
        System.out.println(rev);
    }
    
}
