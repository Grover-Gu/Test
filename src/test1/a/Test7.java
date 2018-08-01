package test1.a;

import java.util.ArrayList;
import java.util.List;

public class Test7 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("adge:ge:dae");
        list.add("aaa:bbb:ccc");
        list.add("aaa:bbc:ddd");
        list.add("bbb:aaa:eee");
        System.out.println(list.contains("aaa:bbb"));
    }
}
