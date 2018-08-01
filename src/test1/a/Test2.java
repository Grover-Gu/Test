package test1.a;

import java.sql.Date;

public class Test2 {
    public static void main(String[] args) {
/*        Long a = 5l;
        Long b = 10l;
        Double c = a*1.0/b*1.0;
        System.out.println(a.getClass().toString());
        System.out.println(a == 5);
        String time = "1940-06-12";
        System.out.println(Date.valueOf(time).toString());
        String cost = "12.0";*/
        //System.out.println(Long.valueOf(cost));
        String cost = "12.5256";
        //Double d = (Double) Math.round((Double.valueOf(cost)*100)/100);
        Double d = Double.valueOf(cost);
        double d2 = (double) Math.round(d*100)/100;
        System.out.println(d2);

    }
}
