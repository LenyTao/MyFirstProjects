import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Parser {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите сумму в долларах которую нужно перевести в рубли:");
        String a = br.readLine();
        a = a.replace(',', '.');
        double summa = Double.parseDouble(a);
        dollarVrubli(summa);
    }

    public static void dollarVrubli(double kolichestvoDeneg) throws IOException {
        Parser pr = new Parser();
        System.out.println(pr.kursDollara() * kolichestvoDeneg);
    }

    public double kursDollara() throws IOException {
        Document doc = Jsoup.connect("https://www.finanz.ru/valyuty/usd-rub").get();
        Elements h1Elements = doc.getElementsByAttributeValue("class", "pricebox content_box");
        String kurs = h1Elements.text();
        kurs = kurs.substring(51, 60).trim();
        kurs = kurs.replace(',', '.');
        return Double.parseDouble(kurs);
    }
}

/**
 * Код для main
 */
//        List<Article> articleList = new ArrayList<>();
//
//        Document doc = Jsoup.connect("https://4pda.ru/").get();
//
//        Elements h1Elements = doc.getElementsByAttributeValue("class", "list-post-title");
//
//        h1Elements.forEach(h1Element -> {
//            Element aElement = h1Element.child(0);
//            String url = aElement.attr("href");
//            String title = aElement.child(0).text();
//
//
//            articleList.add(new Article(url,title));
//        });
//
//        articleList.forEach(System.out::println);

class Article {
    private String url;
    private String name;
    private String kurs;

    public Article(String url, String name) {
        this.name = name;
        this.url = url;
    }

    public String getKurs() {
        return kurs;
    }

    public void setKurs(String kurs) {
        this.kurs = kurs;
    }

    public Article(String kurs) {
        this.kurs = kurs;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Article{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
