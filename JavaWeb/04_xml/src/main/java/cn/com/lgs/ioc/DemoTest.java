package cn.com.lgs.ioc;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * @Author luGuoSong
 * @Date 2020/7/27 17:19
 * @Version 1.0
 */
public class DemoTest {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.parse(new File(DemoTest.class.getClassLoader().getResource("file1.xml").getPath()), "utf-8");
        Elements names = document.getElementsByTag("name");
        System.out.println(names.get(0).text());
    }
}
