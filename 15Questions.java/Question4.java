//  Check whether a character is vowel or consonant using switch-case

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character");
        char a = sc.next().charAt(0);

        switch (a)
         {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':

            System.out.println(a+" is Vowel!");
            break;
        default:
            if ((a >= 'a' && a <= 'z') || (a >= 'A') && a <= 'Z') {
                System.out.println(a + " is Consonant!");
            }
            else {
                System.out.println(a+" is Invalid Input!");
            }
        }
    }
}
