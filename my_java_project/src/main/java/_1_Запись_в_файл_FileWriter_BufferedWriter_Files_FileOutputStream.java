/*
Как записать в файл. Теория
FileWriter — это самый простой способ записать информацию в файл.
Он предоставляет перегруженный метод write() для записи int, байтового массива и String в файл.
FileWriter отлично подходит для записи небольших объемов данных.

BufferedWriter — почти аналогичен FileWriter, но использует внутри себя буфер для записи данных в файл.
Если вам нужно записать в файл большие объемы информации, то ваш выбор должен пасть на BufferedWriter.

FileWriter и BufferedWriter хорошо справляются с записью текстовой информации в файл,
но когда стоит задача записывать в файл данные потока, то желательно использовать FileOutputStream.

Files — вспомогательный класс для работы с файлами.
Он содержит метод, который внутри себя использует OutputStream для  записи массива байтов в файл.
 */

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import java.nio.file.StandardOpenOption;



public class _1_Запись_в_файл_FileWriter_BufferedWriter_Files_FileOutputStream {

    public static void main(String[] args) throws IOException {
//        String data = "Data";
//        writeUsingOutputStream(data);

//        String data2 = "Data";
//        writeUsingFiles(data2);

//        ArrayList<String> data = new ArrayList<>();
//        data.add("строка 1");
//        data.add("строка 2");
//        writeUsingFilesArray(data);

//        String data = "Data";
//        writeUsingFilesString(data);

//        String data = "Data";
//        writeUsingBufferedWriterString(data);

//        ArrayList<String> data = new ArrayList<>();
//        data.add("строка 1");
//        data.add("строка 2");
//        data.add("строка 3");
//        writeUsingBufferedWriterArray(data);

//        String data = "Data";
//        writeUsingFileWriterString(data);

        ArrayList<String> data = new ArrayList<>();
        data.add("строка 1");
        data.add("строка 2");
        data.add("строка 3");
        writeUsingFileWriterArray(data);

    }


/////////////////////////////////////////////////////////////////// пишем в файл с помощью OutputStream
    private static void writeUsingOutputStream(String data) throws IOException {

        OutputStream outputStream = new FileOutputStream(new File("src\\main\\resources\\_1_Запись_в_файл_FileWriter_BufferedWriter_Files_FileOutputStream\\exOutputStream.csv"));
        outputStream.write(data.getBytes(), 0, data.length());

    }


/////////////////////////////////////////////////////////////////// пишем в файл с помощью Files
    private static void writeUsingFilesArray(ArrayList<String> data) throws IOException {                 // для массива

        String path = "src\\main\\resources\\_1_Запись_в_файл_FileWriter_BufferedWriter_Files_FileOutputStream\\exFilesArray.csv";
        Files.write(Paths.get(path), data, StandardOpenOption.CREATE);

    }

    private static void writeUsingFilesString(String data) throws IOException {                 // для массива

        String path = "src\\main\\resources\\_1_Запись_в_файл_FileWriter_BufferedWriter_Files_FileOutputStream\\exFilesString.csv";
        Files.write(Paths.get(path), data.getBytes());

    }

///////////////////////////////////////////////////////////////// пишем в файл с помощью BufferedWriter
    private static void writeUsingBufferedWriterString(String data) throws IOException {
//        File file = new File("src\\main\\resources\\_1_Запись_в_файл_FileWriter_BufferedWriter_Files_FileOutputStream\\exBufferedWriterString.txt");
//        FileWriter fileWriter = new FileWriter(file);
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        bufferedWriter.write(data);
//        bufferedWriter.close();                                                   // можно try catch просто т.к. закрывает

        //сокращенный вариант
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\main\\resources\\_1_Запись_в_файл_FileWriter_BufferedWriter_Files_FileOutputStream\\exBufferedWriterString.txt"));
        bufferedWriter.write(data);
        bufferedWriter.close();

    }

    private static void writeUsingBufferedWriterArray(ArrayList<String> data) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\main\\resources\\_1_Запись_в_файл_FileWriter_BufferedWriter_Files_FileOutputStream\\exBufferedWriterArray.csv"));
//        try {
//            for (String s : data) {
//                bufferedWriter.write(s);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                bufferedWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        //сокращенный вариант
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src\\main\\resources\\_1_Запись_в_файл_FileWriter_BufferedWriter_Files_FileOutputStream\\exBufferedWriterArray.csv"));
        for (String s: data){
            bufferedWriter.write(s);
        }
        bufferedWriter.close();

    }

///////////////////////////////////////////////////////////////// пишем в файл с помощью FileWriter
    private static void writeUsingFileWriterString(String data) throws IOException {
//        File file = new File("src\\main\\resources\\_1_Запись_в_файл_FileWriter_BufferedWriter_Files_FileOutputStream\\exFileWriterString.txt");
//        FileWriter fr = null;
//        try {
//            fr = new FileWriter(file);
//            fr.write(data);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally{
//            try {
//                fr.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        //сокращенный вариант
        File file1 = new File("src\\main\\resources\\_1_Запись_в_файл_FileWriter_BufferedWriter_Files_FileOutputStream\\exFileWriterString.txt");
        FileWriter fileWriter = new FileWriter(file1);
        fileWriter.write(data);
        fileWriter.close();
    }

        private static void writeUsingFileWriterArray(ArrayList<String> data) throws IOException {

            //сокращенный вариант
            File file1 = new File("src\\main\\resources\\_1_Запись_в_файл_FileWriter_BufferedWriter_Files_FileOutputStream\\exFileWriterArray.txt");
            FileWriter fileWriter = new FileWriter(file1);
            for (String s : data){
                fileWriter.write(s);
            }
            fileWriter.close();

    }

}


