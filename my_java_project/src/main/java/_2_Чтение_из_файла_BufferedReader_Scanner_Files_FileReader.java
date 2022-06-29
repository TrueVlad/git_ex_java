


/*
еория
В Java есть класс java.nio.file.Files, который позволяет прочитать все содержимое файла в массив байтов или считать все строки в список.
Класс Files был введен в Java 7 и отлично подходит, если нам нужно загрузить все содержимое файла.
Следует отметить важный момент: желательно использовать этот метод только тогда, когда работаем с небольшими файлами,
так как все содержимое это файла будет в памяти.

Класс java.io.FileReader. Мы можем использовать FileReader, чтобы получить BufferedReader, а затем считывать файлы построчно.
FileReader не поддерживает кодировку и работает с кодировкой системы по умолчанию, так что это не очень эффективный способ чтения файла в Java,
но все же имеет право на жизнь.

Класс java.io.BufferedReader отлично подходит для чтения файла построчно и дальнейшей обработки считанной информации.
Он очень хорошо справляет с обработкой больших файлов и поддерживает кодировку файла. BufferedReader является синхронизируемым,
а поэтому значит, что операции чтения с помощью BufferedReader можно безопасно выполнять из нескольких потоков.
Размер буфера BufferedReader по умолчанию составляет 8 Кбайт.

Класс java.util.Scanner отлично подходит для чтения файла построчно. Сканер разбивает входные данные на лексемы используя разделитель,
который по умолчанию соответствует пробелу. Полученные лексемы могут быть затем преобразованы в значения разных типов с использованием различных методов.
Сканер не синхронизирован, следовательно, не потокобезопасный.
 */


import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class _2_Чтение_из_файла_BufferedReader_Scanner_Files_FileReader {

        public static void main(String[] args) throws IOException {
            String filename = "src\\main\\resources\\_2_Чтение_из_файла_BufferedReader_Scanner_Files_FileReader\\Пример.txt";

            readUsingBufferedReader(filename);
//            readUsingBufferedReaderJava7(filename,); // ?
//            readUsingFileReader(filename);
//            readUsingBufferedReader(filename, StandardCharsets.UTF_8);
//            readUsingFiles(filename);
//            readUsingScanner(filename);

        }


///////////////////////////////////////////////////////////////// читаем  файл с помощью FileReader
        private static void readUsingFileReader(String fileName) throws IOException {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                //обрабатываем считанную строку - пишем ее в консоль
                System.out.println(line);
            }
            br.close();
            fr.close();

        }

///////////////////////////////////////////////////////////////// читаем  файл с помощью BufferedReader
        private static void readUsingBufferedReader(String fileName, Charset cs) throws IOException {
            File file = new File(fileName);
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, cs);
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        }


///////////////////////////////////////////////////////////////// читаем  файл с помощью BufferedReader + Files
        private static void readUsingBufferedReaderJava7(String fileName, Charset cs) throws IOException {
            Path path = Paths.get(fileName);
            BufferedReader br = Files.newBufferedReader(path, cs);
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }


///////////////////////////////////////////////////////////////// читаем  файл с помощью BufferedReader
        private static void readUsingBufferedReader(String fileName) throws IOException {
//            File file = new File(fileName);
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//            String line;
//            while((line = br.readLine()) != null){
//                System.out.println(line);
//            }
//            br.close();
//            fr.close();

            //сокращенная запись
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

            bufferedReader.close();
        }



///////////////////////////////////////////////////////////////// читаем  файл с помощью Scanner
        private static void readUsingScanner(String fileName) throws IOException {
            Path path = Paths.get(fileName);
            Scanner scanner = new Scanner(path);
            //читаем построчно
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
            }
        }

///////////////////////////////////////////////////////////////// читаем  файл с помощью Files
        private static void readUsingFiles(String fileName) throws IOException {
            Path path = Paths.get(fileName);
            //считываем содержимое файла в массив байт
            byte[] bytes = Files.readAllBytes(path);
            //считываем содержимое файла в список строк
            List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);
        }

    }