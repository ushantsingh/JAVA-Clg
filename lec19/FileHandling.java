import java.io.File;
import java.io.FileWriter;

public class FileHandling {
    public static void main(String[] args) {
        try {
            File file = new File("book1.html");
            if (file.delete()) {
                System.out.println("File Bnn Gyaa..." + "\n" + file.getName());
            } else {
                System.out.println("Already Bna hua hai!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        createData();
    }
    
    static void createData() {
        try {
            FileWriter writer = new FileWriter("book1.html",true);
            writer.write("hello hii");
            writer.write("\nI am Samarth ");
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
