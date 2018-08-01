package test1.a;

import java.text.SimpleDateFormat;

public class Test11 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String time = "1532048947000";
        String timestr = simpleDateFormat.format(time);//获取日志时间
        int index = timestr.lastIndexOf(":");
        int indexOfFiveMin = Integer.valueOf(timestr.substring(index + 1)) / 5 + 1;
        String timeKey = timestr.substring(0, index) + " 5*" + indexOfFiveMin;
        System.out.println(timeKey);

    }


}
