package test1.a;

public class Test5 {
    public static void main(String[] args) {
        String str ="";
        //System.out.println( str.substring(0,5));
        String a = "-1";
        if (!"-1".equals(a)){
            System.out.println("a is not -1");
        }
        System.out.println("~~~~~~");
        a = "0";
        if (!"-1".equals(a)){
            System.out.println("a is not -1");
        }

        Double x = 100*200.0/52;
        System.out.println(x);

        String date = "20180215";
        String logDate = date.substring(0,4)+"-"+date.substring(4,6)+"-"+date.substring(6,8);
        System.out.println(logDate);

    }
}
