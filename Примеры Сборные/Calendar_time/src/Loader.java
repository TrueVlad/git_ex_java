import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Loader {
    public static void main(String[] args) {
////////////////////////////////////////////////////////////////////////////////////////
//        Calendar calendar = Calendar.getInstance();
//        long timestamp =calendar.getTime().getTime();
//        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
//        Date date = new Date();
//        System.out.println(dateFormat.format(date));
//
//        System.out.println(timestamp);
//        System.out.print(System.currentTimeMillis());

/////////////////////////////////////////////////////////////////////////////////////////




                DateFormat dateFormat = new SimpleDateFormat("- dd.MM.yyyy - EEE"); //Задаем оформление даты у нас это вид   - 23.08.2015 - Sun
                Calendar calendar = Calendar.getInstance();

                calendar.set(1989, Calendar.MAY, 25);                            // Задаем наш день рождения
                Date date = new Date();
                Date your = calendar.getTime();

                int i = 0;
                while (date.compareTo(your) > 0)                                            // сравниваем дату рождения + количество лет с текущей датой    если дата дня рождения раньше текущей даты получаем 1
                {
                    System.out.println(i + dateFormat.format(your));                        // выводим данные типо  0- 23.08.1981 - Sun, где 0 это количество лет
                    calendar.add(Calendar.YEAR, 1);                                     // Добавляем к дню рождения +1 год
                    your = calendar.getTime();
                    i++;


        }
    }
}
