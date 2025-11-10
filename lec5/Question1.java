// "i love java " -->  "i evol avaj"

public class Question1 {
    public static void main(String[] args) {
        String str = "i love java";
        System.out.println(str);

        String a[] = str.split(" ");

        for (int i = 0; i < a.length; i++) {
            a[i] = new StringBuilder(a[i]).reverse().toString();
            String result = a[i];
            System.out.println(result);
        }
    }
}
