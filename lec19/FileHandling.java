import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileHandling {
    public static void main(String[] args) {
        try {
            File file = new File("book1.html");
            if (file.createNewFile()) {
                System.out.println("File Bnn Gyaa..." + "\n" + file.getName());
            } else {
                System.out.println("Already Bna hua hai!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        createData();
        readData();
        deleteFile();
    }
    
    static void createData() {
        try {
            FileWriter writer = new FileWriter("book1.html", true);
            writer.write("hello hii");
            writer.write("\nI am Samarth ");
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    static void readData() {
        try {
            FileReader reader = new FileReader("book1.html");
            // reader.close();//---> close() lagane se IOException aayega 
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    static void deleteFile() {
        try {
            File file = new File("book2.html");
            if (file.delete()) {
                System.out.println("\nDeleated");
            } else {
                System.out.println("\nNot deleted");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
