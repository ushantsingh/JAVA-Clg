import java.util.HashSet;

public class Question2 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1 };
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            set.add(x);
            if (set.contains(x)) {
                System.out.println(true);
            }
        }
        System.out.println(false);
    }
}
