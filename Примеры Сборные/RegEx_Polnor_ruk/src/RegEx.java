import java.util.regex.*;

class RegExpr {

/////////////////////////////////////////////////////////////////////////////////////////////// валидирует номер телефона не проверял
//        ^(\s*)?(\+)?([- _():=+]?\d[- _():=+]?){10,14}(\s*)?$/

///////////////////////////////////////////////////////////////////////////////////////////////
//    public static void main(String args[]) {
//        Pattern pat;
//        Matcher mat;
//        boolean found;
//
//        pat = Pattern.compile("Java");
//        mat = pat.matcher("Java");
//        found = mat.matches();                                         // проверить на совпадение
//        System.out.println("Пpoвepкa совпадения Java с Java:");
//        if (found) System.out.println("Coвпaдaeт");
//        else System.out.println("He совпадает");
//        String S = "2";
//
//
//
//        System.out.println();
//        System.out.println("Проверка совпадения Java с Java 9:");
//        mat = pat.matcher("Java 9");                                         //создать новый// сопоставитель с шаблоном
//        found = mat.matches();                                              // проверить на совпадение
//
//        if (found) System.out.println("Coвпaдaeт");
//        else System.out.println("He совпадает");
//    }
//}

/////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String args[]) {
        Pattern pat = Pattern.compile("Java");
        Matcher mat = pat.matcher("Java 9");

        System.out.println("Пoиcк Java в Java 9:");
        if (mat.find()) System.out.print("Подпоследовательность найдена");
        else System.out.println("Coвпaдeния отсутствуют");
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////
//    public static void main(String args[]) {
//        Pattern pat = Pattern.compile("test");
//        Matcher mat =pat.matcher("test 1 2 3 test");
//
//        while (mat.find()) {
//            System.out.print("Подпоследовательность test " + "найдена по индексу " + mat.start());
//        }
//    }}
//
///////////////////////////////////////////////////////////////////////////////////////////////
//    public static void main(String args[]) {
//
//        Pattern pat = Pattern.compile("W+");
//        Matcher mat = pat.matcher("ww WW WWWWW WWW");
//
//        while (mat.find()){
//        System.out.println("Совпдение: "+ mat.group());
//        }
//    }
//    }

///////////////////////////////////////////////////////////////////////////////////////////////// Применение метасимволов и кванторов
//public static void main(String args[])
//{
//        Pattern pat = Pattern.compile("e.+d");
//        Matcher mat = pat.matcher("extend cup end taЬle");
//        while(mat.find())
//        System.out.println("Coвпaдeниe: "+ mat.group());
//        }
//        }

///////////////////////////////////////////////////////////////////////////////////////////////////
//    public static void main(String args[]) {                                                        // составить шаблон для нестрогого совпадения
//        Pattern pat = Pattern.compile("e.+?d");
//        Matcher mat = pat.matcher("extend cup end taЬle");
//        while (mat.find())
//            System.out.println("Coвпaдeниe: " + mat.group());
//    }
//}

/////////////////////////////////////////////////////////////////////////////////////////////////////     разделить на слова
//    public static void main(String args[]) {
//                                                              // составить шаблон для сопоставления со словами,
//                                                               //  набранными строчными буквами
//        Pattern pat = Pattern.compile("[a-z]+");
//        Matcher mat = pat.matcher("this is а test.");
//        while (mat.find())
//            System.out.println("Coвпaдeниe: " + mat.group());
//    }
//}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    public static void main(String args[]) {
//        String str = "Jon Jonathan Frank Ken Todd";
//        Pattern pat = Pattern.compile("Jon.*? ");
//        Matcher mat = pat.matcher(str);
//        System.out.println("Иcxoднaя последовательность: " + str);
//        str = mat.replaceAll("Eric ");
//        System.out.println("Измeнeннaя последовательность: " + str);
//    }
//}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    public static void main(String args[]) {
//        // составить шаблон для сопоставления со словами,
//        // набранными строчными буквами
//        Pattern pat = Pattern.compile(" [ , . ! ] ");
//        String strs[] = pat.split("one two, alpha9 l2!done.");
//        for (int i = 0; i < strs.length; i++)
//            System.out.println("Cлeдyющaя лексема: " + strs[i]);
//    }
//}

