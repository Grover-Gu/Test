package test1.a;

import java.util.*;

public class Text6 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String ,Integer>();
        map.put("1",2);
        map.put("2",5);
        map.put("3",1);
        map.put("4",5);
        List<Map.Entry<String,Integer>> list = new ArrayList(map.entrySet());
        Collections.sort(list,(o1,o2)->(o2.getValue()-o1.getValue()));
        System.out.println(list.get(0).getKey());
    }
}
