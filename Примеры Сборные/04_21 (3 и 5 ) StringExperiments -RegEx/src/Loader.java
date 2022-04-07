import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public class Loader
{
    static final String text = "Тайланд красивая страна. Многие люди посещают Тайланд каждый год";
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static boolean test (String s)
    {
        Pattern patern = Pattern.compile("^Ivan$");    // саздаем правило
        Matcher m = patern.matcher(s);                 // Применяем правило к объекту
        return m.matches();                           // Вернули результат соответствия строки с правилом
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static boolean test2 (String s)
    {
        Pattern patern = Pattern.compile(".+\\.(com|ru|org)");    // саздаем правило
        Matcher m = patern.matcher(s);                 // Применяем правило к объекту
        return m.matches();                           // Вернули результат соответствия строки с правилом
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args)
    {
//        System.out.println(test("Ivan"));
//        System.out.println(test(" Ivan"));
//        System.out.println(test("Iva n"));
//        System.out.println(text.replaceAll("[Тт]а[ий]ланд", "Россия"));      // Заменяет слова по шаблонам regex
//        System.out.println(test2("site.ua"));                                                // Заменяет слова по шаблонам regex
//
//        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

//////////////////////////////////////////////////////////////////////

//        String subTextVasya = text.substring(0,text.indexOf(','));                                                          // Текст до первой запятой
//        String subTextVasyaSum = subTextVasya.substring(subTextVasya.indexOf("л")+2,subTextVasya.lastIndexOf('р')-1);   // Часть текста с суммой заработка
//        int vasyaSum = Integer.valueOf(subTextVasyaSum);                                                                    // Текст заработка в число
//        System.out.println("Вася заработал: " + vasyaSum);
//        ///////////////////////////////////////////////////////////
//
//        String subTextPeter = text.substring(text.indexOf(',')+2,text.lastIndexOf(','));                                // Текст между запятыми
//        String subTextPeterSum = subTextPeter.substring(subTextPeter.indexOf("-")+2,subTextPeter.lastIndexOf('р')-1);   // Часть текста с суммой заработка
//        int peterSum = Integer.valueOf(subTextPeterSum);                                                                    // Текст заработка в число
//        System.out.println("Петя заработал: " + peterSum);
//        //////////////////////////////////////////////////////////
//
//        String subTextMasha = text.substring(text.lastIndexOf(',')+2);                                                   // Текста после последней запятой
//        String subTextMashaSum = subTextMasha.substring(subTextPeter.indexOf("-")+4,subTextMasha.lastIndexOf('р')-1);    // Часть текста с суммой заработка
//        int mashaSum = Integer.valueOf(subTextMashaSum);                                                                     // Текст заработка в число
//        System.out.println("Маша заработала: " + mashaSum);
//
//        System.out.println("Маша и Вася заработали: " + (mashaSum+vasyaSum));



        String url = "https://lenta.ru";
        String stringUtils = StringUtils.repeat("\t", url.lastIndexOf("/") != url.length() - 1 ? StringUtils.countMatches(url, "/") - 2 : StringUtils.countMatches(url, "/") - 3);
        System.out.println(stringUtils);


    }


}