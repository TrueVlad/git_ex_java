

import java.util.ArrayList;
import java.util.HashMap;

public class Main {


    public static void main(String[] args) {
/////////////////////////////////////////////////////////////////////////////////////// 1
//        ArrayList <Integer> some_dyn  = new ArrayList<>(5);
//        some_dyn.add(26);
//        some_dyn.add(2);
//        some_dyn.add(6);
//        some_dyn.add(126);
//        some_dyn.add(236);
//
//
//
//        System.out.println(some_dyn.get(1));
///////////////////////////////////////////////////////////////////////////////////////// 2
        int arr[] = {1,2,3,4};

        try
        {
//            int  x = 100/0;                                    // убрал, т.к. ловит первую ошибку и дальше не идет
            System.out.println(arr[10]);
        }
        catch(ArithmeticException a){                            // ловим ошибку деление на 0
            System.out.println("Ошибка: " + a);
        }
        catch(Exception b){                                     // ловим ошибку любую, в нашем случае не существует элемента массива
            System.out.println("Ошибка массива: " + b);
        }
        finally{
            System.out.println("Наконец-то работает ");
        }

    }

}