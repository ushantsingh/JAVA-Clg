class Song extends Thread {
    public void run() {
        String str = "कमर up कमर up कमर up\n" + //
                        "कमर down कमर down\n" + //
                        "कमर up\n" + //
                        "कमर down कमर down\n" + //
                        "\n" + //
                        "गोरे गोरे मुख प कला कला केसिया\n" + //
                        "गोरे गोरे मुखप काला काला केसिया\n" + //
                        "लागे दोनों अखिया brown\n" + //
                        "ये...";
        for (char ch : str.toCharArray()) {
            System.out.print(ch);
            try {
                Thread.sleep(100); // 1 second delay between each character
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class SongDemo {
    public static void main(String[] args) {
        Song s1 = new Song();
        s1.start();  // start() creates a new thread and calls run()
    }
}
