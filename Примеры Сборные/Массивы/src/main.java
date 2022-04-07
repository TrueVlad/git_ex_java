import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Object;
import java.lang.System;


public class main {
    static public void main(String[] args){
//////////////////////////////////////////////////////////////////////////////////////////// Объявление массива
//        String[] aArray = new String[5];
//        String[] bArray = {"a","b","c", "d", "e"};
//        String[] cArray = new String[]{"a","b","c","d","e"};

//////////////////////////////////////////////////////////////////////////////////////////// Вывод массива в Java
//        int[] intArray = { 1, 2, 3, 4, 5 };
//        String intArrayString = Arrays.toString(intArray);
//
//        // print directly will print reference value
//        System.out.println(intArray);
//        // [I@7150bd4d
//
//        System.out.println(intArrayString);
//        // [1, 2, 3, 4, 5]

//////////////////////////////////////////////////////////////////////////////////////////// Создание ArrayList из массива
//        String[] stringArray = { "a", "b", "c", "d", "e" };
//        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
//        System.out.println(arrayList);
//        // [a, b, c, d, e]

//////////////////////////////////////////////////////////////////////////////////////////// Проверка массива на наличие конкретного значения
//        String[] stringArray = { "a", "b", "c", "d", "e" };
//        boolean b = Arrays.asList(stringArray).contains("a");
//        System.out.println(b);
//        // true

//////////////////////////////////////////////////////////////////////////////////////////// Объединение двух массивов
//        int[] intArray = { 1, 2, 3, 4, 5 };
//        int[] intArray2 = { 6, 7, 8, 9, 10 };
//        // Apache Commons Lang library
//        int[] combinedIntArray = ArrayUtils.addAll(intArray, intArray2);

//////////////////////////////////////////////////////////////////////////////////////////// Объявление массива в одной строке
//        method(new String[]{"a", "b", "c", "d", "e"});

//////////////////////////////////////////////////////////////////////////////////////////// Объединение элементов массива в строку
//        // containing the provided list of elements
//        // Apache common lang
//        String j = StringUtils.join(new String[] { "a", "b", "c" }, ", ");
//        System.out.println(j);
//        // a, b, c

//////////////////////////////////////////////////////////////////////////////////////////// Преобразование ArrayList в массив
//        String[] stringArray = { "a", "b", "c", "d", "e" };
//        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
//        String[] stringArr = new String[arrayList.size()];
//        arrayList.toArray(stringArr);
//        for (String s : stringArr)
//            System.out.println(s);

//////////////////////////////////////////////////////////////////////////////////////////// Преобразование массива во множество (Set)
//        Set<String> set = new HashSet<String>(Arrays.asList(stringArray));
//        System.out.println(set);
//        //[d, e, b, c, a]

//////////////////////////////////////////////////////////////////////////////////////////// Возврат массива с элементами в обратном порядке
//        int[] intArray = { 1, 2, 3, 4, 5 };
//        ArrayUtils.reverse(intArray);
//        System.out.println(Arrays.toString(intArray));
//        //[5, 4, 3, 2, 1]

//////////////////////////////////////////////////////////////////////////////////////////// Удаление элемента из массива
//        int[] intArray = { 1, 2, 3, 4, 5 };
//        int[] removed = ArrayUtils.removeElement(intArray, 3);//create a new array
//        System.out.println(Arrays.toString(removed));

//////////////////////////////////////////////////////////////////////////////////////////// создание массива типа byte на основе значения типа int (прим. берем ByteBuffer, выделяем в нем 4 байта и кладем число int 8, затем все это (0, 0, 0, 8) преобразуем в массив типа byte с помощью вызова array())
//        byte[] bytes = ByteBuffer.allocate(4).putInt(8).array();
//
//        for (byte t : bytes) {
//            System.out.format("0x%x ", t);
//        }

//////////////////////////////////////////////////////////////////////////////////////////// варианты заполнения/вывода массива
//        int[] roomCount = new int[6];              // так
////        int[] roomCount = {5, 45, 34, 0, 0};      // или так
//        roomCount[1] = 5;
//        roomCount[2] = 45;
//        roomCount[3] = 34;
//
//
//        for (int i=1; i < roomCount.length; i++)  // length - не метод массива, а св-во
//        System.out.println(roomCount[i]);

//////////////////////////////////////////////////////////////////////////////////////////// Массив строк
//        String text = "Каждый охотник желает знать где сидит фазан";
//        String[] colors = text.split(",?\\s+");
//
////        for (int i=0; i < colors.length; i++)          // length - не метод массива, а св-во
////        System.out.println(colors[i]);
//
//         for (String colorWord : colors)                                             // или можно распечатать так
//             System.out.println(colorWord);

//////////////////////////////////////////////////////////////////////////////////////////// Лотерейные билеты
//        int[] ticketNumbers = new int[1000];
//
//        int winTickets[] = new int[10];
//
//        for(int i = 0; i < ticketNumbers.length; i++)
//        {
//            int value = 1000000 + (int) Math.round(1000000 * Math.random());
//            ticketNumbers[i] = value;
//
//            if (i % 100 == 0) {                                                   // выигрышные билеты каждый сотый билет (делится на 100 без остатка)
//            winTickets[i / 100] = value;
//            }
//            System.out.println(value);
//        }
//
//        System.out.println("==========Выиграли билеты==============");           // Выиграшные билеты
//
//        for(int winTicketNumber : winTickets)
//        {
//            System.out.println(winTicketNumber);
//        }

//////////////////////////////////////////////////////////////////////////////////////////// Массив в обратном порядке
//        String text = "Каждый охотник желает знать где сидит фазан";
//        String[] colors = text.split(",?\\s+");
//
//        for (int i = colors.length - 1; i >= 0; i--)          // length - не метод массива, а св-во
//        System.out.println(colors[i]);

//////////////////////////////////////////////////////////////////////////////////////////// Сравнение 2х подряд идущих элементов массива
//        String text = "Каждый охотник желает знать где где сидит сидит фазан";
//        String[] colors = text.split(",?\\s+");
//
//        for (int i=0; i < colors.length; i++)
//        {
//            if (i > 0 && colors[i].equals(colors[i-1])){
//            continue;
//            }
//            System.out.println(colors[i]);
//        }

//////////////////////////////////////////////////////////////////////////////////////////// Массивы массивов
//        int [] [] studentsMarks = {
//                {4,5,1,2,4},
//                {3,4,2,4,5,2,2,3},
//                {2,3,5,4,1},
//                {2,5,46,1,3,261,32,1},
//            };
//
//
//        for (int i=0; i < studentsMarks.length; i++) {
//            System.out.println("Класс " + i + " (" + studentsMarks[i].length + " Студетов)" );
//
//            for (int j = 0; j < studentsMarks[i].length; j++){
//                System.out.println(studentsMarks[i][j]);
//            }
//            System.out.println();
//        }


//////////////////////////////////////////////////////////////////////////////////////////// вывод 2х мерного массива через метод
//        int[][] myArray = {{18,28,18},{28,45,90},{45,3,14}};
//        System.out.print(Arrays.deepToString(myArray));

//////////////////////////////////////////////////////////////////////////////////////////// вывод 2х мерного массива
//        int [][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};//объявили массив и заполнили его элементами
//        for (int i = 0; i < 3; i++) {  //идём по строкам
//            for (int j = 0; j < 4; j++) {//идём по столбцам
//                System.out.print(" " + twoDimArray[i][j] + " "); //вывод элемента
//            }
//            System.out.println();//перенос строки ради визуального сохранения табличной формы
//        }

//////////////////////////////////////////////////////////////////////////////////////////// шахматная доска цвета
//        String [][] chessBoard = new String[8][8];
//        for (int i = 0; i< chessBoard.length; i++) {
//            for (int j = 0; j < chessBoard[0].length; j++) {
//
//                if ((i + j) % 2 == 0) {chessBoard[i][j] = "W";
//                System.out.print(" " + chessBoard[i][j]+ " ");}
//
//                else {chessBoard[i][j] = "B";
//                System.out.print(" " + chessBoard[i][j]+ " ");}
//                ;
//            }
//            System.out.println();
//        }

////////////////////////////////////////////////////////////////////////////////////////////  шахматная доска цвета + Номера ячеек
//        String [][] chessBoard = new String[8][8];
//        for (int i = 0; i < chessBoard.length; i++) {
//            for (int j = 0; j < chessBoard[0].length; j++) {
//                if ((i + j) % 2 == 0) chessBoard[i][j] = "W" + Array.chessBoardCoord(j,i);
//                else chessBoard[i][j] = "B"+ Array.chessBoardCoord(j,i);
//            }
//        }
//
//        for (int i = 0; i < chessBoard.length; i++) {
//            for (int j = 0; j < chessBoard[0].length; j++) {
//                System.out.print(" " + chessBoard[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        Array.chessBoardCoord(8,8);                                                         // Метод в Классе Array

////////////////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////
    }
}
