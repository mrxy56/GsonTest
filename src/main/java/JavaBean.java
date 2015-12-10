import java.util.Date;

/**
 * Created by Mac on 15/12/10.
 */
public class JavaBean {
    public Weatherinfo weatherinfo;
    public static class Weatherinfo{
        public String city;
        public String cityid;
        public String temp1;
        public String temp2;
        public String weather;
        public String img1;
        public String img2;
        public String ptime;
    }
    @Override
    public String toString() {
        return "Weatherinfo [city=" + weatherinfo.city +
                          ", cityid=" + weatherinfo.cityid +
                          ", temp1=" + weatherinfo.temp1 +
                          ", temp2=" + weatherinfo.temp2 +
                          ", weather=" + weatherinfo.weather +
                          ", img1=" + weatherinfo.img1 +
                          ", img2=" + weatherinfo.img2 +
                          ", ptime=" + weatherinfo.ptime + "]";
    }
}
