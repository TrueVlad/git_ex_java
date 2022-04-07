import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
///////////////////////////////////////////////////////////////
//        int [] name;            // создаем массив
//        name = new int[5];      // выделяем под массив памятьф
//        name [4] = 23;          // заполняем последнюю "ячейку" массива
//
////        int [] name = new int[] {1,2,3,4,23};    // вариант заполнения массива
//
//        System.out.println(name.length);        // вывод длины массива
//
//        for (int i = 0; i < name.length ; i++)  // вывод массива
//            System.out.println(name[i]);

///////////////////////////////////////////////////////////////     создаем и заполняем массив из Scanner
        int [] a;
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = new int [n];
        for (int i = 0; i<n ; i ++){
            System.out.println("Enter a[" + i + "] = ");
            a[i] = in.nextInt();
        }
    }
}
