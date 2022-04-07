package my.suveng.jsoup.utils;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashSet;
import java.util.Set;
import lombok.Data;
import org.apache.commons.io.FileUtils;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @author       создан в 2018/12/22
 * @Description: учебник по jsoup, фактическое соединение с боевым сканированием
 */
@Data
public class Links {


  private static final String DOMAIN = "https://suveng.github.io";    // Мое доменное имя
  private String targetDomain = "https://suveng.github.io";           // Целевое доменное имя
  private Set<String> saved = new HashSet<>();                        // Сохраненные ссылки
  String targetHref;                                                  // Последняя ссылка

  public void myblog(Links jsoupMain) throws IOException {
    Document doc = Jsoup.connect(Links.DOMAIN+"/blog").get();
    Elements links = doc.select("a[href]");
    jsoupMain.saveLinksByElements(links);
  }

  private void saveLinksByElements(Elements links) throws IOException {
    if (links == null) {
      return;
    }
    for (Element element : links) {
      // Обработка типа соединения
      dealwithHref (element);

      if (!saved.contains(targetHref)) {
        System.out.println("\nlink : " + targetHref);
        System.out.println("text : " + element.text());
        Elements targetLink = getLinks(targetHref);
        if (targetLink == null) {
          return;
        }
        saveLinks();
        saveLinksByElements(targetLink);
      }
    }
  }

  private void dealwithHref(Element element) {                                //Обработка соединений

    targetHref=element.attr("abs:href");
    // Процесс кодирования
    try {
      this.targetHref = URLDecoder.decode(targetHref, "utf-8");
    } catch (UnsupportedEncodingException e) {
      System.err.println("Неподдерживаемая кодировка, предлагаем перейти на UTF-8");
      this.targetHref = null;
      return;
    }
    dealwithDomain();
  }

  private void dealwithDomain() {            // Определить, является ли это текущим доменным именем, только текущее доменное имя поддерживает сканирование, не поддерживает междоменный домен
    if (!this.targetHref.contains(this.targetDomain)){
      this.targetHref=null;
    }
  }

  /**
   * Получить ссылку
   * @param url targetHref
   * @return  document.select("a[href]");
   */
  private Elements getLinks(String url) {
    try {
      Connection connect = Jsoup.connect(url);
      Document document;
      document = connect.get();
      return document.select("a[href]");
    } catch (Exception e) {
      System.err.println("Плохая ссылка");
      return null;
    }
  }

  private void saveLinks() throws IOException {  //  Сохранить ссылку
    saved.add(this.targetHref);
    File links = new File("links.log");
    FileUtils.writeStringToFile(links, this.targetHref + '\n', "utf-8", true);
  }
}
