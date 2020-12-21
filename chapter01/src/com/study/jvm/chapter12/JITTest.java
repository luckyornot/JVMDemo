package com.study.jvm.chapter12;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author wang
 * @create 2020-12-08-16:44
 */
public class JITTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            list.add("让天下没有难学的技术");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testString(){

        Integer num1=100;
        Integer num2=100;
        System. out. println (num1==num2) ;
        Integer num3=128;
        Integer num4=128;
        System. out. println (num3==num4) ;

    }
}
