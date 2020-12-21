package com.study.jvm.chapter01.part3;

/**
 * @author wang
 * @create 2020-12-16-15:50
 */
public class ArrayTest {
    public static void main(String[] args) {
        Object[] arr = new Object[10];
        System.out.println(arr);

        String[][] arr1 = new String[10][10];
        System.out.println(arr1);

        long[][] arr2 = new long[10][10];
        System.out.println(arr2);
    }
}
