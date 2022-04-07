import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*  мы можем использовать любой из этих классов в Java при создании экземпляра объекта Scanner
            BufferedReader, CharArrayReader, CharBuffer, FileReader, FilterReader, InputStreamReader, LineNumberReader, PipedReader, PushbackReader, Reader, StringReader
        */
        try {
            FileReader reader = new FileReader(new File("G:\\папка\\test.txt"));
            Scanner scan = new Scanner(reader);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error Reading File");
            e.printStackTrace();
        }


    }
}
