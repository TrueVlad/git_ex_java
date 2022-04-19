import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class _3_HTTP_запрос {
    public static void main(String[] args) {

///////////////////////////////////////////////////////////////////простой get запрос стандартными сре-ми java
    String query = "https://api.vk.com/method/users.get?user_id=210700286&v=5.52";

    HttpURLConnection connection = null;

    try{

        connection = (HttpURLConnection) new URL(query).openConnection();   // открываем коннект

        // задаем параметры подключения
        connection.setRequestMethod("GET");                                 // указываем метод запроса, по умолчанию всегда GET
        connection.setUseCaches(false);                                     // не использовать кеширование
        connection.setConnectTimeout(250);                                  // устанавливаем таймаут подключения
        connection.setReadTimeout(250);                                     // устанавливаем таймаут чтения

        connection.connect();                                               // подключаемся

        // читаем ответ

        StringBuilder stringBuilder = new StringBuilder();                                // для преобразрования входящих строк

        if (HttpURLConnection.HTTP_OK == connection.getResponseCode() ){             // если ответ вернулся с кодом 200 (ок), читаем ответ
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));              // если кирилица, через запятую в параметре задаем кодировка "cp1251"

            String line;
            while ((line = in.readLine()) != null){
                stringBuilder.append(line);
                stringBuilder.append("/n");                                  // построчно читаем
            }

            System.out.println(stringBuilder.toString());
        } else {
            System.out.println("fail: " + connection.getResponseCode() + ", " + connection.getResponseMessage()); // в случае неудачи выдает параметры ответа
        }

    } catch (Throwable cause) {
        cause.printStackTrace();
    } finally {
        if (connection != null) {
            connection.disconnect();
        }
    }

    }
}
