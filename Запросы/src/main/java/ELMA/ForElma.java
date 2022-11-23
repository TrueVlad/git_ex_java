
import org.w3c.dom.ls.LSOutput;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.net.HttpURLConnection;
        import java.net.URL;

public class ForElma {
    public static void main(String[] args) {


        String elementId = "08a4e331-4d7a-437e-8bb3-5785e7c3a0ea";    //  4fec7f80-446d-4337-b3b6-9ed91f0d20c4
        String queryForOneElement = "http://fasp.sale.elewise.com/pub/v1/app/fasp/duty/" + elementId + "/get";       // url для 1 элемента приложения по ID   https://imeczdyzj3kxw.elma365.ru/pub/v1/app/fasp/testovoe/


        HttpURLConnection connection =null;


        try {
            connection = (HttpURLConnection) new URL(queryForOneElement).openConnection();     // открываем коннект для 1 элемента

            //настраиваем подключение
            connection.setRequestMethod("POST");               // указываем вид запроса
            connection.setUseCaches(false);                   // нет кеширования запроса
            connection.setConnectTimeout(250);                // таймаут время подключения
            connection.setReadTimeout(250);                   // таймаут чтения
            connection.setRequestProperty("X-Token", "67f079d3-ad02-420b-925b-a3256faff772");         // токен для авторизации   d2932dff-4af3-416c-ad22-57f7251cb0e2

            connection.connect();                             // отправляем

            StringBuilder stringBuilder = new StringBuilder();    // сздаем билдер для посторения строки

            if (HttpURLConnection.HTTP_OK == connection.getResponseCode() ){
                System.out.println("200");

                // читаем ответ

                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "cp1251")); // читаем в буферридер + кодировку вводим (cp1251)

                String line;
                while ((line = in.readLine()) != null){
                    stringBuilder.append (line);                 //добавлям строку в стрингбилдер
                    stringBuilder.append ("/n");                 //добавлям перенос строки
                }

                System.out.println(stringBuilder.toString());

            }
            if (HttpURLConnection.HTTP_UNAUTHORIZED == connection.getResponseCode()){
                System.out.println("Не авторизировались");
            }
            else {
                System.out.println(stringBuilder.toString());
                System.out.println("Код ответа " + connection.getResponseCode());
            }

        }
        catch (Throwable couse){
            couse.printStackTrace();
        }
        finally {
            if (connection != null){
                connection.disconnect();
            }
        }
    }
}
