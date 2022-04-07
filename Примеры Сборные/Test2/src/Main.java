import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String pathString = "C:\\Users\\truno\\OneDrive\\Рабочий стол\\папка\\Java\\Примеры Сборные\\Test2\\src\\1.txt";

        FileInputStream fis = new FileInputStream(pathString);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");

        int s = 0;
        while ((s = isr.read())!=-1){

            System.out.println((char) s);
        };
        fis.close();
        isr.close();



//    FileOutputStream fos = new FileOutputStream(pathString);
//    String str = "Hot!";
//    fos.write(str.getBytes());
        FileWriter fr = new FileWriter(pathString,true);
        fr.write("java");
        fr.close();

    }

}
