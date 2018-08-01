package test1.a;

public class Test3 {
    public static void main(String[] args) {
        Double a = 0D;
        Double b = 0D;
        Double c= 0D;
        long a11 = 13;
        long a12 = 6;
        long b11 = 10;
        long b12 = 6;
        long c11 = 4;
        long c12 = 3;
        a = (double)Math.round(b11*10000/a11)/100;
        b = (double)Math.round(c11*10000/b11)/100;
        c = (double)Math.round(a*b)/100;
        System.out.println(a + "\r\n" + c);
        System.out.println(b11*1.0/a11);
        System.out.println((b11*1.0/a11)*(c11*1.0/b11));
        System.out.println(a*b);



    }
}
