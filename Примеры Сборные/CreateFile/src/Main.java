import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {


//////////////////////////////////////////////// создаю директорию
        File dir = new File("fileDir");

        if (dir.isDirectory()){
            System.out.println("директоря уже создана");
        }
        else dir.mkdir();

//////////////////////////////////////////////// создаю файл
        File file = new File("fileDir\\file1.txt");        // если не относительно проекта, то нужен путь целиком ("C:\Users\truno\OneDrive\Рабочий стол\папка\Java\Примеры Сборные\CreateFile\fileDir\\file1.txt")

        if (file.exists()){
            System.out.println("файл уже создан");
        }
        else file.createNewFile();

//////////////////////////////////////////////// операции с файлом                                        # 1
        System.out.println("\n" +"1" );

        File file2 = new File("fileDir\\file2.txt");

        if (file2.exists()){
            System.out.println("файл уже создан");
        }
        else file2.createNewFile();

        FileWriter fileWriter = new FileWriter(file2);
        fileWriter.write("strq \n");
        fileWriter.write("strqw \n");
        fileWriter.write("strqw \n");
        fileWriter.flush();
        fileWriter.close();

        FileReader fileReader = new FileReader(file2);
        char[] chars = new char[20];
        fileReader.read(chars);
        System.out.println(chars);

        System.out.println("1" + "\n");

///////////////////////////////////////////////        BufferedWriter/bufferedReader                                                        # 2
        System.out.println("\n" +"2" );

        FileWriter fileWriter2 = new FileWriter(file);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter2);
        bufferedWriter.write("bufferWriter");
        bufferedWriter.newLine();
        bufferedWriter.write("bufferWriterф");
        bufferedWriter.flush();
        bufferedWriter.close();

        FileReader fileReader2 = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader2);
        while (bufferedReader.ready())                                  
            System.out.println("File " + bufferedReader.readLine());

        System.out.println("File длина " + file.length());

        System.out.println("2" + "\n");

//////////////////////////////////////////////// skill box
        System.out.println("skill box" );

        File directory = new File("fileDir\\filesDir");
        directory.mkdir();


        File directory1 = new File("fileDir");
        File[] dires = directory1.listFiles();                              // записываем содержимое папок в массив

        for(File f : dires){
            System.out.println(f.getAbsolutePath());
        }

        System.out.println("skill box" + "\n");

////////////////////////////////////////////////  FileInputStream                                                                   # 3
        System.out.println("3");

        StringBuilder stringBuilder = new StringBuilder();

    try {
        FileInputStream is = new FileInputStream("fileDir\\file1.txt");
        for(;;)
            {
            int code = is.read();                           // читаем посимвольно, записываем в код код символа
            if (code < 0)
                break;
            char ch = (char)code;
            stringBuilder.append(ch);
            }
        }
    catch (FileNotFoundException ex){
        ex.printStackTrace();
        }
        System.out.println(stringBuilder.toString());

        System.out.println("3" + "\n");

////////////////////////////////////////////////  FileInputStream + bufferedReader                     # 4
        System.out.println("4");

        StringBuilder stringBuilder2 = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader("fileDir\\file1.txt"));
            for(;;){
                String line = br.readLine();
                if (line==null) {
                    break;
                }
                stringBuilder2.append(line + "\n");
            }
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        System.out.println(stringBuilder2.toString());

        System.out.println("4" + "\n");

////////////////////////////////////////////////  FileInputStream                                                                   # 5
        System.out.println("5");

        StringBuilder stringBuilder3 = new StringBuilder();

        try {
           List<String> lines = Files.readAllLines(Paths.get("fileDir\\file1.txt"));
           lines.forEach(l -> stringBuilder3.append(l + "\n"));
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }

        System.out.println(stringBuilder3.toString());

        System.out.println("5" + "\n");


    }

}
