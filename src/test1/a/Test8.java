package test1.a;

import java.util.*;

public class Test8 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,-1);
        String time = calendar.get(Calendar.YEAR)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"+calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(time);

        List<String> filename= new ArrayList<>();
        filename.add("d=20180203");
        filename.add("d=20180204");
        filename.add("d=20180206");
        filename.add("d=20180304");
        filename.add("d=20180305");
        filename.add("d=20180306");
        Collections.sort(filename);
        int i = filename.indexOf("d=20180304");

        System.out.println(filename.get(i+1));

        for (String s: filename
             ) {
            System.out.println(s);
        }



    }
}
