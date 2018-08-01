package test1.a;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        String str = "JDBC.hd.name";
        System.out.println(str.contains("JDBC.hd"));
        Map<String,String> mapProps = new HashMap();
        mapProps.put("mysql.hd.username", "yingb");
        mapProps.put("mysql.hd.password", "biaoy");
        mapProps.put("mysql.hd.url", "test.com");
        mapProps.put("mysql.hd.driverClassName", "heidirver");

        Properties prop = new Properties();
        Set<String> listPropsKey = new HashSet<String>();
        listPropsKey.add("mysql.hd.username");
        listPropsKey.add("mysql.hd.password");
        listPropsKey.add("mysql.hd.url");
        listPropsKey.add("mysql.hd.driverClassName");
        for (String propsKey : listPropsKey) {
            if (propsKey.contains("mysql.hd")){
                int index = propsKey.lastIndexOf(".");
                String setKey = propsKey.substring(index+1);
                String setValue = mapProps.get(propsKey);
                System.out.println("setKey:" + setKey+"    setvalue:"+setValue);
                prop.setProperty(setKey,setValue);
            }
        }
        System.out.println(prop.get("username"));
    }
}
