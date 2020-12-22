package com.study.jvm.chapter03.java1;

import org.junit.Test;

import java.util.Random;

/**
 * 3. 当使用类、接口的静态字段时(final修饰特殊考虑)，比如，使用getstatic或者putstatic指令。（对应访问变量、赋值变量操作）
 *
 */
public class ActiveUse2 {
    @Test
    public void test1(){
        System.out.println(User.num);      // 主动使用
//      System.out.println(User.num1);   // 被动使用
//      System.out.println(User.num2);   // 主动使用
    }

    @Test
    public void test2(){
        System.out.println(CompareA.NUM1);      // 被动使用
//      System.out.println(CompareA.NUM2);    // 主动使用
    }
}

class User{
    static{
        System.out.println("User类的初始化过程");
    }

    public static int num = 1;
    public static final int num1 = 1;
    public static final int num2 = new Random().nextInt(10);

}

interface CompareA{
    public static final Thread t = new Thread(){
        {
            System.out.println("CompareA的初始化");
        }
    };

    public static final int NUM1 = 1;
    public static final int NUM2 = new Random().nextInt(10);

}