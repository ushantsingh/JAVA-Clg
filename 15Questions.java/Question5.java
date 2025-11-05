// Print numbers from 1 to N using a for loop

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number till which you want to print :");
        int n = sc.nextInt();

        System.out.println("The Number from 1 to "+n);
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
