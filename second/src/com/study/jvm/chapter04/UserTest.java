package com.study.jvm.chapter04;

/**
 * @author shkstart
 * @create 10:36
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User(); // 隐式加载

        try {
            Class clazz = Class.forName("com.study.jvm.chapter04.User"); // 显式加载
            ClassLoader.getSystemClassLoader().loadClass("com.study.jvm.chapter04.User"); // 显式加载
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
