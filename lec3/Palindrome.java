

public class Palindrome {
    public static void main(String[] args) {
        String a = "aba";
        String b = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        if (a.equals(b)) {
            System.out.println("Ji Palindrome Hai");
        }
        else {
            System.out.println("Ji Palindrome nhi Hai!");
        }
    }
}
