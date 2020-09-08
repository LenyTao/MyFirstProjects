import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;

public class DownLoader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите сcылку:");
        StringBuffer url = new StringBuffer(reader.readLine());
        url = converterURL(url);
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.browse(URI.create(url.toString()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static StringBuffer converterURL(StringBuffer sb) {
        StringBuffer shell = new StringBuffer("https://ru.savefrom.net/7/#url=&utm_source=youtube.com&utm_medium=short_domains&utm_campaign=www.ssyoutube.com&a_ts=");
       // sb = sb.replace(4, 5, "");
    //    sb = sb.replace(7, 11, "");
        return shell.insert(31, sb.toString().trim());
    }
}
