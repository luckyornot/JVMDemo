package com.study.jvm.chapter12;

import org.junit.Test;

/**
 * @author wang
 * @create 2020-12-08-20:14
 */
public class StringTest4 {
    /*public static void main(String[] args) {
        System.out.println(); // 2330
        System.out.println("1"); // 2331
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10"); // 2340

        // 如下的字符串"1" 到 "10"不会再次加载
        System.out.println("1"); // 2341
        System.out.println("2"); // 2341
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10"); // 2341
    }*/

    @Test
    public void test5(){
        String s1 = "javaEEhadoop";
        String s2 = "javaEE";
        String s3 = s2 + "hadoop";
        System.out.println(s1 == s3); // false

        final String s4 = "javaEE"; // s4:常量
        String s5 = s4 + "hadoop";
        System.out.println(s1 == s5); // true

        String s7 = "hadoop";
        String s6 = s4 + s7;
        System.out.println(s1 == s6); // false
    }

    public static void main (String[] args) {
        String foo=args[1] ;
        String bar=args[2] ;
        String baz=args[3] ;
        System.out.println(baz) ; //java Test Red Green Blue
    }

}
