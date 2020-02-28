package net.maromo;

public class Main {

    public static void main(String[] args) {
        int a, b, c, d=0, e;
        a = 2;
        b = 3;
        c = ++a + b++;
        d+= (c + a++);
        e = --d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }
}
