package com.study.jvm.chapter01;

/**
 * @author wang
 * @create 2020-12-14-10:50
 */
public class StringTest {
    public static void main(String[] args) {
        String str = new String("hello") + new String("world");
        String str1 = "helloworld";
        System.out.println(str == str1); // false
    }
}
