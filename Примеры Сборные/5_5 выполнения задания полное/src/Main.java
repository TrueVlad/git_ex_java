import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static HashSet<String> carNumberSet = new HashSet<>();                                                                 // Set для номеров
    static String[] lettersOfCarNumberArray = {"C", "M", "T", "B", "A", "P", "O", "H", "E", "Y", "X", "K"};                      // Массив для возможных букв

    static long timeSearch;                            // переменная для времени поиска, оставил поле глобальным, т.к. на мой взгляд очень удобно получилось замерять прямо в методе, и выводить без "print" из метода

    public static void main(String[] args) {

        Arrays.asList(lettersOfCarNumberArray);                            // преобразуем массив в лист (можно сразу в листе создавать)
        Collections.sort(Arrays.asList(lettersOfCarNumberArray));         // сортируем лист по буквам

/////////////////////////////////////////////////////////////////////////////////////////////////////////// добавляем элементы для одинаковых цифр
        for (int i = 111; i <= 999; i = i + 111) {                                               // сначала цифры
            for (int k = 0; k < lettersOfCarNumberArray.length; k++) {                           // буква 1
                for (int f = 0; f < lettersOfCarNumberArray.length; f++) {                        // буква 2
                    for (int j = 0; j < lettersOfCarNumberArray.length; j++) {                  // буква 3
                        for (int g = 1; g < 800; g++) {                                          // потом регион
                            if (isInvalidRegion(g))
                                continue;
                            else {
                                String regionOfCarNumber = String.format("%02d", g);
                                String numberOfCarNumber = String.format("%03d", i);
                                String carNumber = lettersOfCarNumberArray[k] + numberOfCarNumber + lettersOfCarNumberArray[f] + lettersOfCarNumberArray[j] + regionOfCarNumber;
                                carNumberSet.add(carNumber);
                            }
                        }
                    }
                }
            }
        }

//////////////////////////////////////////////////////////////////////////////////////////////////////////// добавляем элементы для одинаковых букв
        for (int i = 0; i < lettersOfCarNumberArray.length; i++) {         // сначала буквы
            for (int k = 1; k <= 999; k++) {                               // потом цифры
                for (int g = 1; g < 800; g++) {                            // потом регион
                    if (isInvalidRegion(g))
                        continue;
                    else {
                        String numberOfCarNumber = String.format("%03d", k);
                        String regionOfCarNumber = String.format("%02d", g);
                        String carNumber = lettersOfCarNumberArray[i] + numberOfCarNumber + lettersOfCarNumberArray[i] + lettersOfCarNumberArray[i] + regionOfCarNumber;
                        carNumberSet.add(carNumber);
                    }
                }
            }
        }
//////////////////////////////////////////////////////////////////////////////////////////////////////////// Исполняем программу

//        for (String str : carNumberSet)
//        System.out.println(str);

        System.out.println("Всего элементов: " +carNumberSet.size());             // смотрим получившийся размер листа

        ArrayList<String> carNumberList = new ArrayList<String>(carNumberSet);    // Set в ArrayList
        Collections.sort(carNumberList);                                          // сортируем лист

        Scanner scn = new Scanner(System.in);
        Pattern pattern = Pattern.compile("[C M T B A P O H E Y X K]\\d\\d\\d[C M T B A P O H E Y X K][C M T B A P O H E Y X K]\\d\\d+");  // Паттерн для номера

        for (; ; ) {
            System.out.println("Введите искомый номер авто: ");
            String searchScr = scn.nextLine();                    // Записываем в переменную номер
            Matcher matcher = pattern.matcher(searchScr);         // Передаем номер матчеру

            if (matcher.find()) {                                    // Если ок, стартуем
                System.out.println("Вы ввели: " + searchScr);

                System.out.println(directSearch(carNumberList, searchScr) ? "Поиск перебором: номер найден, поиск занял " + timeSearch + " нс" : "Поиск перебором: не найден, поиск занял "+ timeSearch + " нс" );
                System.out.println(binarySearch(carNumberList, searchScr) >= 0 ? "Бинарный поиск:: номер найден, поиск занял " + timeSearch + " нс" : "Бинарный поиск:: не найден, поиск занял "+ timeSearch + " нс" );
                System.out.println(treeSetSearch(carNumberList, searchScr) ? "Поиск в TreeSet: номер найден, поиск занял " + timeSearch + " нс" : "Поиск в TreeSet: не найден, поиск занял "+ timeSearch + " нс" );
                System.out.println(hashSetSearch(carNumberList, searchScr) ? "Поиск в HashSet: номер найден, поиск занял " + timeSearch + " нс" : "Поиск в HashSet: не найден, поиск занял "+ timeSearch + " нс" );
                System.out.println();
            }
            else
                System.out.println("Неправильный формат, попробуйте еще раз...");
        }
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////// методы
    static boolean isInvalidRegion(int g) {           // убираем ненужные регионы регионов
        boolean i;
        if ((g > 99 && g < 102) || (g > 102 && g < 113) || (g > 113 && g < 116) || (g > 116 && g < 121) || (g > 127 && g < 134)
                || (g > 134 && g < 136) || (g > 136 && g < 138) || (g > 138 && g < 142) || (g > 142 && g < 147) || (g > 147 && g < 150)
                || (g > 150 && g < 152) || (g > 152 && g < 154) || (g > 154 && g < 159) || (g > 159 && g < 161) || (g > 164 && g < 169)
                || (g > 169 && g < 173) || (g > 174 && g < 177) || (g > 178 && g < 186) || (g > 186 && g < 190) || (g > 190 && g < 193)
                || (g > 193 && g < 196) || (g > 199 && g < 702) || (g > 702 && g < 716) || (g > 716 && g < 750) || (g > 750 && g < 761)
                || (g > 761 && g < 763) || (g > 763 && g < 777) || (g > 777 && g < 799))
            i = true;
        else i = false;
        return i;
    }

    static boolean directSearch(ArrayList arrayList, String carNumber) {           // Прямой перебор
        long start = System.nanoTime();
        arrayList.contains(carNumber);                                           // поиск прямым перебором
        timeSearch = System.nanoTime() - start;
        return arrayList.contains(carNumber);
    }

    static int binarySearch(ArrayList arrayList, String carNumber) {           // Бинартный поиск
        long start = System.nanoTime();
        int i = Collections.binarySearch(arrayList, carNumber);                // бинарный поиск, отсортировали лист выше, перед телом программы 75 строчка
        timeSearch = System.nanoTime() - start;
        return i;
    }

    static boolean treeSetSearch(ArrayList arrayList, String carNumber) {           // TreeSet
        TreeSet<String> treeSet = new TreeSet<>(arrayList);
        long start = System.nanoTime();
        boolean i = treeSet.contains(carNumber);                       // поиск TreeSet
        timeSearch = System.nanoTime() - start;
        return i;
    }

    static boolean hashSetSearch(ArrayList arrayList, String carNumber) {           // HashSet
        HashSet<String> hashSet = new HashSet<>(arrayList);
        long start = System.nanoTime();
        boolean i = hashSet.contains(carNumber);          // поиск HashSet
        timeSearch = System.nanoTime() - start;
        return i;
    }
}
