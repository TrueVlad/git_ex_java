import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static TreeMap<String, String> nameTelNumber = new TreeMap<>();   // создаем TreeMap

    public static void main(String[] args) {


        Pattern pattern = Pattern.compile("[0-9]+|LIST|[a-zA-Z]+");         // общий паттерн
        Pattern patTel = Pattern.compile("[0-9]+");                           // паттерн для телефона
        Pattern patName = Pattern.compile("[a-zA-Z]+");                       // паттерн для имени
        Pattern patList = Pattern.compile("LIST");                            // паттерн для "LIST"
        System.out.println("Введите номер телефона / Имя / команду \"LIST\": ");

//////////////////////////////////////////////////////////////////////////////////////////// заполняем МАР
        nameTelNumber.put("904", "Anton");
        nameTelNumber.put("906", "Ivan");
        nameTelNumber.put("905", "Petr");
        nameTelNumber.put("901", "Galya");
        nameTelNumber.put("910", "Luba");
        nameTelNumber.put("900", "Ira");
        nameTelNumber.put("902", "Dima");

//____________________________________________________________________________________________  Способ 1 преобразования Мара в один лист
////////////////////////////////////////////////////////////////////////////////////////////
//        List entryList = new ArrayList(nameTelNumber.entrySet());             // map в list
//
//        for (int i = 0; i < entryList.size(); i++)                            // выводим значение листа через равно (формат key=value)
//            System.out.println("№ " + (i + 1) + " : " + entryList.get(i));

//____________________________________________________________________________________________  Способ 2 преобразования Мара в 2 листа
//////////////////////////////////////////////////////////////////////////////////////////// выводим МАР
        for (String key : nameTelNumber.keySet())
                        System.out.println("Тел (ключ): " + key + " " + " Имя (Значение) " + nameTelNumber.get(key));

        System.out.println("_____________________________");

//////////////////////////////////////////////////////////////////////////////////////////// выводим значение МАР по ключу
        System.out.println( nameTelNumber.get("904"));


//////////////////////////////////////////////////////////////////////////////////////////// Способ разделения мара на 2 листа с ключами и значениями соответственно

        List keyList = new ArrayList(nameTelNumber.keySet());            // список ключей

        List valueList = new ArrayList(nameTelNumber.values());           // список значений

        System.out.println("_________Ключи________________");             // выводим ключи

                for (int i = 0; i < keyList.size(); i++)
            System.out.println("№ " + (i + 1) + " : " + keyList.get(i));

        System.out.println("_________Значения________________");           // выводим значения

                for (int i = 0; i < valueList.size(); i++)
            System.out.println("№ " + (i + 1) + " : " + valueList.get(i));

//////////////////////////////////////////////////////////////////////////////////////////// ищем ключ по значению
        System.out.println("_________ищем________________");

        System.out.println(valueList.indexOf("Dima"));             // индекс значения
        int valueIndex = valueList.indexOf("Dima");


        System.out.println("Искомый ключ: "+ keyList.get(valueIndex));







    }
}


//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        for (; ; ) {
//            Scanner scanner = new Scanner(System.in);
//            Matcher matcher = pattern.matcher(scanner.nextLine());
//
//            if (matcher.find()) {                                         // если соответствует общему паттерну, запускаем ВЕЧНЫЙ ИИИФ
//
//                String input = matcher.group();                            // записываем введенное в переменную
//
//                Matcher matTel = patTel.matcher(input);                    // делаем матчеры для ЛИСТ, телефона, имени
//                Matcher matName = patName.matcher(input);
//                Matcher matList = patList.matcher(input);
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//                if (matList.find()) {                                                     // если ввели ЛИСТ
//                    System.out.println("Контакты:");
//                    for (String key : nameTelNumber.keySet())
//                        System.out.println("Имя (Значение): " + nameTelNumber.get(key) + " " + " Телефон (Ключ) " + key);
//
//
////----------------------------------------------------------------------------------------------------------------
//
//                } else if (matTel.find()) {                                               // если ввели телефон (ключ)
//                    String tel = input;
//                    if (!nameTelNumber.containsKey(tel)) {
//                        System.out.println("Введите соответствующее имя: ");
//                        Scanner scrName = new Scanner(System.in);
//                        matName = patName.matcher(scrName.nextLine());
//                        if (matName.find()) {
//                            String name = matName.group();
//                            System.out.println("все гуд");
//                            nameTelNumber.put(tel, name);
//                        } else {
//                            System.out.println("Неверно введено имя, начните заново");
//                        }
//                    } else {
//                        System.out.println("Данному телефону уже соответствует имя: " + nameTelNumber.get(tel));
//                    }
//
////----------------------------------------------------------------------------------------------------------------
//
//
//                } else if (matName.find()) {                                       // если ввели имя (Value)
//                    String name = input;
//
//                    if (!nameTelNumber.containsValue(name)) {
//
//                    System.out.println("Введите соответствующий номер: ");
//                    Scanner scrTel = new Scanner(System.in);
//                    matTel = patTel.matcher(scrTel.nextLine());
//                    if (matTel.find()) {
//                        String tel = matTel.group();
//                        System.out.println("все гуд");
//                        nameTelNumber.put(tel, name);
//                    } else {
//                        System.out.println("Неверно введен номер телефона, начните заново");
//                    }
//                }
//                    else { System.out.println(nameTelNumber.);}
//                }
//
////----------------------------------------------------------------------------------------------------------------
//            } else {
//                System.out.println("Вы ввели неправильные значения/команду, попробуйте еще раз");        // если сразу мимо
//            }
//        }
//    }
//}

