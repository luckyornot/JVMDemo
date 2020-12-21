package com.study.jvm.chapter12;

/**
 * @author wang
 * @create 2020-12-09-10:45
 */
class A { }
class B extends A { }
public class Test {
    public static void main (String[] args) {
        A b1 = new B();
        B b2 = new B();
        get(b1);
        get(b2) ;
    }
    public static void get(A a) {
        System. out. println("A") ;
    }
    public static void get(B a) {
        System. out.println("B") ;
    }
}


