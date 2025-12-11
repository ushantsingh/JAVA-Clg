class Song extends Thread {
    public void run() {
        String str = "Yup Yup Yup haa haa Hee hee ";
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
