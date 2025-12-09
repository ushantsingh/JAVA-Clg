

public class Throw {
    public static void main(String[] args) {
        voteAge(19);
    }

    static void voteAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("You Cannot Vote");
        } else {
            System.out.println("You can Vote");
        }
    }
}
