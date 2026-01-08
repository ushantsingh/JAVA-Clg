// first non repeating characters Ex:- aabbcd. ---> c 

public class NonRepeating_Characters {

    void FirstNonRepeating(String str) {
        // String str = "ushant singh";
        int freq[] = new int[256];
        for (int ch : str.toCharArray()) {
            freq[ch]++;
        }
        // System.out.println("Frequency of Characters are : ");
        // for (int i = 0; i < 256; i++) {
        //     if (freq[i] > 0) {
                // System.out.println((char) i + "-->" + freq[i]);
            // }
        // }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                System.out.println("First non-repeating character: " + str.charAt(i));
                return;
            }
        }
        System.out.println("All characters are repeating");
    }

    public static void main(String[] args) {
        NonRepeating_Characters obj = new NonRepeating_Characters();
        obj.FirstNonRepeating("aabbcdd");
    }
}
