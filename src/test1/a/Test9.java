package test1.a;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("月光落在我窗台");
        list.add("四周静悄悄我还在自己嗨");
        list.add("半夜不睡觉进入诗人状态");
        list.add("我想大概我上辈子是李白");
        list.add("床前明月光谁低头思故乡");
        list.add("这星空三千丈编一编做翅膀");
        list.add("会唱的一起唱");
        list.add("不会唱就和我");
        list.add("啦啦啦啦啦");
        list.add("夜还长你打算怎么办");
        System.out.println(list.size());
//        System.out.println(list.get(10));
        System.out.println(list.indexOf("a"));

    }
}
