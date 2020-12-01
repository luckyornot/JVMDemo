package com.study.jvm;

import java.util.Date;

/**
 * @author wang
 * @create 2020-11-30-20:05
 */
public class LocalVariablesTest {

    public static void main(String[] args) {
        LocalVariablesTest test = new LocalVariablesTest();
        int num = 10;
        test.test1();
    }

    public void test4() {
        int a = 0;
        {
            int b = 0;
            b = a + 1;
        }
        //变量c使用之前已经销毁的变量b占据的slot的位置
        int c = a + 1;
    }

    public static void testStatic(){
        LocalVariablesTest test = new LocalVariablesTest();
        Date date = new Date();
        int name = 10;
        System.out.println(date);
    }

    public void test1(){
        Date date = new Date();
        String name = "jvm";
        System.out.println(date + name);
    }


}
