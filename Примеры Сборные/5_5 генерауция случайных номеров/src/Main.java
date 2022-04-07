import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    static String numbersOfCarNumber;
    static String lettersOfCarNumber;
    static String regionOfCarNumber;
    static String carNumber;

    public static void main(String[] args) {

        System.out.println("____________Цифры номера авто______________");

        for (int i = 1; i < 100; i++)
            System.out.println(getNumbersOfCarNumber());


        System.out.println("____________Буквы номера авто______________");
        System.out.println(getLettersOfCarNumber());
        System.out.println("____________Регион авто______________");
        System.out.println(getRegionOfCarNumber());
        System.out.println("____________Номер авто______________");
        System.out.println(geCarNumber());

    }

    public static String getNumbersOfCarNumber() {
        double i = 0;
        while (i == 0) {
            i = Math.round(Math.random() * 10);
        }
        String numbersOfCarNumber = Double.toString(i).substring(0, 1) + Double.toString(i).substring(0, 1) + Double.toString(i).substring(0, 1);
        return numbersOfCarNumber;
    }

    public static String getLettersOfCarNumber() {
        return lettersOfCarNumber;
    }

    public static String getRegionOfCarNumber() {
        return regionOfCarNumber;
    }

    public static String geCarNumber() {
        return carNumber;
    }
}


// C M T B A P O H E Y X K
//
//        ArrayList <String> arrayList = new ArrayList<>();
//
//        arrayList.add(0,"first");
//        arrayList.add(1,"second");
//        arrayList.add(2,"third");
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
//
//        Collections.sort(arrayList);       // сортируем лист
//        System.out.println(Collections.binarySearch(arrayList, "second"));       //
//
//
//        HashSet<String> set = new HashSet<>();
//        set.addAll(arrayList);
//
//        Scanner scr = new Scanner(System.in);
//        for(;;){
//
//            long start = System.currentTimeMillis();      // замерить время в милисекундах   System.nanoTime() - время в наносекундах
//            long duration = System.currentTimeMillis() - start;
//             }
//            // Найти номер 4 разными способами
//
//            // 1 прямой перебор list.contains()
//            // 2 бинарный поиск Collection.binarySearch() работает, когда отсартирован по алфавиту
//            // 3 с помощью TreeSet
//            // 4 с помощью HashSet
//            // сравнить время поиска всеми методами