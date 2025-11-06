// linear search
// user se ek number lo,aur check kro wo number array me hai ya nhi

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the Array Element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Number to be Search : ");
        int num = sc.nextInt();

        boolean found = false;
        for (int element : arr) {
            if (element == num) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(num + " is present in the Array ");
        }
        else {
            System.out.println(num+" is not present int the array");
        }
    }
}
