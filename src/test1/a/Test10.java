package test1.a;

import java.util.ArrayList;
import java.util.List;

public class Test10 {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        list.add(Long.valueOf(new String("d=1563248").substring(2)));
        System.out.println(list.get(0));
    }
}
