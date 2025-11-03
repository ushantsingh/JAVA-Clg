// package lec1;

public class grade_Calculator {
    public static void main(String[] args) {
        int marks = 89;
        int attend = 89;
        if (marks > 90 && attend >= 75) {
            System.out.println("Grade : A");
        } else if (marks > 80 && attend >= 75) {
            System.out.println("Grade : B");
        } else if (marks > 70 && attend >= 75) {
            System.out.println("Grade : C");
        } else if (marks > 60 && attend >= 75) {
            System.out.println("Grade : D");
        } else if (marks > 40 && attend >= 75) {
            System.out.println("Grade : E");
        } else if (marks > 30 && attend >= 75) {
            System.out.println("Grade : F");
        } else {
            System.out.println("Grade : Fail");
        }
    }
}

