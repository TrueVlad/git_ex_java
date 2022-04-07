package my.suveng.jsoup;

import java.io.File;
import java.io.IOException;
import my.suveng.jsoup.utils.Links;
import my.suveng.jsoup.utils.SiteMapXML;
import org.apache.commons.io.FileUtils;

/**
 * @author 苏文广 created at 2018/12/22
 * @Description:
 */
public class Main {
  public static void main(String[] args) throws IOException {
    Links links = new Links();
    // Получить ссылку и сохранить ее в links.log

    links.myblog(links);

    SiteMapXML siteMapXML = new SiteMapXML();

    siteMapXML.createSiteMap("links.log");
    // Удалить после генерации
    FileUtils.deleteQuietly(new File("links.log"));
  }
}
