import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Mac on 15/12/10.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownFile{
        public static String getHTML(String pageURL, String encoding){
        StringBuilder pageHTML = new StringBuilder();
        try {
            URL url = new URL(pageURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), encoding));
            String line = null;
            while ((line = br.readLine()) != null) {
                pageHTML.append(line);
                pageHTML.append("\r\n");
            }
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pageHTML.toString();
    }
}
