package my.suveng.jsoup.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

/**
 * @author       создан в 2018/12/22
 * @Description: класс инструмента создания карты сайта
 */
public class SiteMapXML {


  public void createSiteMap(String linksPath) throws IOException {
    Document document = DocumentHelper.createDocument();
    Element locs = document.addElement("urlset","http://www.sitemaps.org/schemas/sitemap/0.9");
    List<String> strings = FileUtils.readLines(new File(linksPath), Charset.forName("utf-8"));
    for (String url : strings) {
      Element loc = locs.addElement("url","http://www.sitemaps.org/schemas/sitemap/0.9");
      loc.addElement("loc").setText(url);
      loc.addElement("lastmod")
              .setText(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE));
    }
    writeAndFlush(document);
  }

  public void writeAndFlush(Document document) {
    try {
      OutputFormat format = OutputFormat.createPrettyPrint();
      format.setEncoding(document.getXMLEncoding());
      Writer fileWriter = new FileWriter("sitemap.xml");
      XMLWriter xmlWriter = new XMLWriter(fileWriter, format);
      xmlWriter.write(document);
      xmlWriter.close();
    } catch (IOException e) {
      System.err.println("Не удалось экспортировать xml, проверьте writeandflush ()");
    }
  }

  /**
   * Формат XML и запись в файл
   */
  protected void writeFile4Pretty(File file, Document document) throws IOException {

    OutputFormat format = OutputFormat.createPrettyPrint();
    format.setEncoding(document.getXMLEncoding());
    XMLWriter writer = new XMLWriter(new FileWriter(file), format);
    writer.write(document);
    writer.flush();
    writer.close();
  }

  /***
   * Формат XML как строка
   */
  protected String prettysString(Document document) throws IOException {
    OutputFormat format = OutputFormat.createPrettyPrint();
    format.setEncoding(document.getXMLEncoding());
    StringWriter stringWriter = new StringWriter();
    XMLWriter writer = new XMLWriter(stringWriter, format);
    writer.write(document);
    writer.close();
    return stringWriter.toString();
  }


}
