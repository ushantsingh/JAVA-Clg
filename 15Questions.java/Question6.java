// Sum of first N natural numbers using while loop

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Natural Number ");
        int n = sc.nextInt();
        
        int i=1;
        System.out.println("Natural Number from 1 to "+n +" is : ");
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
