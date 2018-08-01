package test1.a;

public class TestEnum {
    enum Counter {
        showCount
    }

    public static void main(String[] args) {
        Counter.valueOf("showCount");
    }

}
