// Check whether a number is divisible by 5 and 11 using if-else

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();

        if (n % 5 == 0 ) {
            System.out.println(n + " is devisible by 5");
        }
        else if (n % 11 == 0) {
            System.out.println(n + " is devisible by 11");
        }
        else {
            System.out.println(n +" is not Divisible by 5 & 11");
        }
    }
}
