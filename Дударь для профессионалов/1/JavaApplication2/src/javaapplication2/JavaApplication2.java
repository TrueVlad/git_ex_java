
package javaapplication2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class JavaApplication2 {

    
    public static void main(String[] args) {
//////////////////////////////////////////////////////////////////////////////////////////// # ArrayList        
//        ArrayList <Integer> some_dyn  = new ArrayList<>(5);             // ArrayList
//        some_dyn.add(26);
//        some_dyn.add(23);
//        some_dyn.add(6);
//        some_dyn.add(12);
//        some_dyn.add(23);
//        
//        System.out.println(some_dyn.get(4));
//        
//        for(Integer x : some_dyn)
//        {
//            System.out.print("-"+x);
//            
//        }
//        
//        LinkedList <String> some_dyn1  = new LinkedList<>();             // LinkedList 
//        some_dyn1.add("Twer");
//        some_dyn1.add("asdf");
//        some_dyn1.add("asdf");
//        some_dyn1.add("asdvf");
//        some_dyn1.add("asdd");
//        some_dyn1.add(1, "1111");                       // Меняем 2ой элемент 
//        
//        System.out.println(some_dyn1.get(4));
//        
//        for(String x : some_dyn1)
//        {
//            System.out.print("-"+x);
//        }
//        
///////////////////////////////////////////////////////////////////////////////////// # 3 Отслеживание исклюяений

//        int arr[] = {1,2,3,4};
//
//        try 
//        {
////            int  x = 100/0;                                    // убрал, т.к. ловит первую ошибку и дальше не идет
//            System.out.println(arr[10]);
//        }
//        catch(ArithmeticException a){                            // ловим ошибку деление на 0
//        System.out.println("Ошибка: " + a);
//        }
//        catch(Exception b){                                     // ловим ошибку любую, в нашем случае не существует элемента массива
//        System.out.println("Ошибка массива: " + b);
//        }
//        finally{
//            System.out.println("Наконец-то работает ");
//        }
        
 ///////////////////////////////////////////////////////////////////////////////////// # 4     запись и чтение из файлов    
 
                                                                    // смотри все импортированные библиотеки
                                                                    // Слишком много try catch, можно убрать
// BufferedReader br = null;                                           // создаем объект для чтения файла
//
// try{File file = new File("newFile.txt");                           // создаем новый файл       
//    if (!file.exists())                                             // если файл не существует, создаем новый
//    file.createNewFile();         
//    
//    PrintWriter pw = new PrintWriter(file);                         // создаем объект для записи в файл 
//    pw.println("Everething is working");                            // записываем в файл 
//    pw.println("Hello world");                   
//    pw.close();                                                     // закрываем в файл
//    
//    br = new BufferedReader(new FileReader("newFile.txt"));         // выделяем память под объект br (new...) и в конструктор добавляем необходимый файл
//    String line;
//    while((line=br.readLine()) !=null){                             // записываем в line последовательно строки, пока строка не станет нулевой
//        System.out.println(line);
//        
//    }
// } 
// catch (IOException e) {
//    System.out.println("Error: "+e);
// }      
//    finally {
//     try{
//     br.close();}                                                  // закрываем объект br
//     catch (IOException e) {
//    System.out.println("Error: "+e);}
// }




}
}
