public class frequency_count {
    public static void main(String[] args) {
        String str = "ushant singh";
        int freq[] = new int[256];
        for (int ch : str.toCharArray()) {
            freq[ch]++;
        }
        System.out.println("Frequency of Characters are : ");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i+"-->"+freq[i]);
            }
        }
    }
}