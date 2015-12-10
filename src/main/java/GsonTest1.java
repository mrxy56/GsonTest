/**
 * Created by Mac on 15/12/10.
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GsonTest1 {
    public static void main(String args[]){
        String str=DownFile.getHTML("http://www.weather.com.cn/adat/cityinfo/101010100.html", "UTF-8");
        System.out.println(str);
        Gson gson = new Gson();
        JavaBean javabean = gson.fromJson(str, JavaBean.class);
        System.out.println("Json转为简单Bean===" + javabean);
    }
}

