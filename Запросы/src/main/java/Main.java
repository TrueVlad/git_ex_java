import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {


/////////////////////////////////////////////////////////////////////////////////////////////////////////
        URL url = new URL("http://jsonplaceholder.typicode.com/posts?_limit=10");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");
//            con.setConnectTimeout(CONNECTION_TIMEOUT);
//            con.setReadTimeout(CONNECTION_TIMEOUT);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

        while (in.readLine() != null)
        System.out.println(in.readLine());

//        String inputLine;
//        StringBuilder content = new StringBuilder();
//        while ((inputLine = in.readLine()) != null ){
//            content.append(inputLine);
//        }
//
//        System.out.println(content.toString() );

/////////////////////////////////////////////////////////////////////////////////////////////////////////


    }

}
