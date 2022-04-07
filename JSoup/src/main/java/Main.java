import name.finsterwalder.fileutils.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        String stringUrl = "https://ria.ru/";

//////////////////////////////////////////////////////////////////////////////////////// 1. URL загрузка документа
//        Document document = Jsoup.connect(stringUrl).get();
//        System.out.println(document.title());

//////////////////////////////////////////////////////////////////////////////////////// 2. URL загрузка документа из файла
        try
        {
            Document document = Jsoup.parse( new File( "src\\main\\resources\\htmlFile.html" ) , "utf-8" );
            System.out.println(document.title());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

//////////////////////////////////////////////////////////////////////////////////////// 3. Загрузить документы из строки
//        String html = "<html><head><title>First parse</title></head>"
//                + "<body><p>Parsed HTML into a doc.</p></body></html>";
//        Document document = Jsoup.parse(html);
//        System.out.println(document.title());

//////////////////////////////////////////////////////////////////////////////////////// Пример программы: список ссылок
        Document doc = Jsoup.connect(stringUrl).get();
        Elements links = doc.select("a[href]");
        Elements media = doc.select("[src]");
        Elements imports = doc.select("link[href]");

        print("\nMedia: (%d)", media.size());
        for (Element src : media) {
            if (src.tagName().equals("img"))
                print(" * %s: <%s> %sx%s (%s)",
                        src.tagName(), src.attr("abs:src"), src.attr("width"), src.attr("height"),
                        trim(src.attr("alt"), 20));
            else
                print(" * %s: <%s>", src.tagName(), src.attr("abs:src"));
        }

        print("\nImports: (%d)", imports.size());
        for (Element link : imports) {
            print(" * %s <%s> (%s)", link.tagName(),link.attr("abs:href"), link.attr("rel"));
        }

        print("\nLinks: (%d)", links.size());
        for (Element link : links) {
            print(" * a: <%s>  (%s)", link.attr("abs:href"), trim(link.text(), 35));
        }
    }

    private static void print(String msg, Object... args) {
        System.out.println(String.format(msg, args));
    }

    private static String trim(String s, int width) {
        if (s.length() > width)
            return s.substring(0, width-1) + ".";
        else
            return s;


   }
}

