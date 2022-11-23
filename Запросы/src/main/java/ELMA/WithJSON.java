import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class WithJSON {
    public static void main(String[] args) throws IOException, ParseException {
//        URL url = new URL ("https://imeczdyzj3kxw.elma365.ru/pub/v1/app/fasp_2/contracts/list");                     // создадим объект URL с целевой строкой URI, которая принимает данные JSON с помощью метода HTTP POST:
//        URL url = new URL ("https://imeczdyzj3kxw.elma365.ru/pub/v1/app/fasp_2/contracts/create");
        URL url = new URL ("https://imeczdyzj3kxw.elma365.ru/pub/v1/app/fasp_2/duty/create");

        HttpURLConnection con = (HttpURLConnection)url.openConnection();                                                // Из приведенного выше объекта URL мы можем вызвать метод open Connection , чтобы получить объект HttpURLConnection|

        con.setRequestMethod("POST");                                                                                   // определяем метод
        con.setRequestProperty("Content-Type", "application/json; utf-8");                                              // Установите “content-type” заголовок запроса в “application/json” , чтобы отправить содержимое запроса в форме JSON
        con.setRequestProperty("Accept", "application/json");                                                           // Установите “Принять” заголовок запроса на “приложение/json” чтобы прочитать ответ в нужном формате:
        con.setDoOutput(true);                                                                                          // Чтобы отправить содержимое запроса, давайте включим свойство URLConnection объекта do Output в true В противном случае мы не сможем записывать содержимое в выходной поток подключения:

        con.setRequestProperty("X-Token", "67f079d3-ad02-420b-925b-a3256faff772");                                      // токен для авторизации c ELMA d2932dff-4af3-416c-ad22-57f7251cb0e2 d2932dff-4af3-416c-ad22-57f7251cb0e2
                                                                                                                        // чоздаем в теле JSON
        String jsonInputString = "";
//                "{\n" +
//                "  \"context\": {\n" +
//                "    \"duty\": [\n" +
//                "      \"30b01936-50ea-4051-b455-f5cd41aa157c\"\n" +
//                "    ]}}";

        try(OutputStream os = con.getOutputStream()) {                                                                  // отправляем?
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
        }


        try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))) {     // получаем ответ

            StringBuilder response = new StringBuilder();
            String responseLine = null;

            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
//            System.out.println(response.toString());

            String stringResponse = response.toString();

//            System.out.println(stringResponse);


            JSONParser parser = new JSONParser();                                                                       // парсим JSON
            JSONObject jsonObject = (JSONObject)parser.parse(stringResponse);


            Gson gson = new GsonBuilder().setPrettyPrinting().create();       // приводим в читабельный вид
            String gstr = gson.toJson(jsonObject);

            System.out.println(gstr);

            writeUsingOutputStream(gstr);

        }


    }

    private static void writeUsingOutputStream(String gstr) throws IOException {                                              // метод для записи ответа в файл

        OutputStream outputStream = new FileOutputStream(new File("src\\main\\resources\\exOutputStream.txt"));
        outputStream.write(gstr.getBytes(), 0, gstr.length());

    }


    private static String JsonParser(String s) throws ParseException {

        JSONParser parser = new JSONParser();                                                                       // парсим JSON
        JSONObject jsonObject = (JSONObject)parser.parse(s);


        Gson gson = new GsonBuilder().setPrettyPrinting().create();       // приводим в читабельный вид
        String gstr = gson.toJson(jsonObject);

        return gstr;

    }
}
