//Print multiplication table of a number using loop 

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();

        System.out.println("The Table of "+n+"is ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
}
