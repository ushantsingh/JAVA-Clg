public class functions {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        str.append("j");
        // System.out.println(str);
        str.insert(2, "byee");
        System.out.println(str);
    }
}
