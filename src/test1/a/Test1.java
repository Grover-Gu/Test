package test1.a;

public class Test1 {
    public static void main(String[] args) {
        String str = "1996-10-01 12:52:20";
        System.out.println(str.substring(0,10));
        Double a = 100*1.0/200;
        System.out.println(a);
        String str2 = "1235"+"\t"+ "8852" +"\t"+"8221:ddev";
        String[] strs = str2.split("\t|:");
        for (String s :
                strs) {
            System.out.println(s);
        }
        System.out.println(strs);


        String strtt = "adf::";
       int index1 = strtt.indexOf(':');
       int index2 = strtt.indexOf(':',index1+1);
       int index3 = strtt.length();
        System.out.println(index1);
        System.out.println(index2);
        String planId = index1==0?"":strtt.substring(0,index1);
        String mediaId = index2-index1 ==1?"":strtt.substring(index1+1,index2);
        String mediaName = index3-index2 ==1?"":strtt.substring(index2+1);
        System.out.println("index1:"+index1);
        System.out.println("index2:"+index2);
        System.out.println("index3:"+index3);

        System.out.println("planId:"+planId);
        System.out.println("mediaId:"+mediaId );
        System.out.println("mediaName:"+mediaName);
    }
}
