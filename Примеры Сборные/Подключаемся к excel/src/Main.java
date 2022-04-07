import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {


//        List<String> list = Files.readAllLines(Paths.get("src\\res\\1.csv")); // читаем excel
//        for (String s : list){
//            System.out.println(s);
//        }

        String url = "https://khazoff.notion.site/Frontend-5f5541a0bfe44131b6ed3955dd858cf8";
        Document docHtml = Jsoup.connect(url).get();
//        System.out.println(docHtml);
        Elements elements = docHtml.select("div");

        ArrayList<String> str = new ArrayList<String>();

        for (Element element:elements){                                       // преобразовываем елементы в строку и записываем в каллекцию
            str.add(element.toString());
            System.out.println(element);
        }


    }
}
