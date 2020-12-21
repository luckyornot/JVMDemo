package com.study.jvm.chapter12;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wang
 * @create 2020-12-09-11:08
 */
public class Demo1 {
    /*int i = getJ() ;
    int j=0;
    public int getJ() {
        j=10;
        System. out.println(i);
        return j;
    }
    public static void main(String[] args) {
        Demo1 demo = new Demo1 () ;
        System.out.println (demo.j) ;
    }*/

    public static void main(String[] args) {
        List<String> list = new ArrayList();

        list.add("波老师");
        list.add("苍老师");
        list.add("松老师");

        for (String s : list) {
            list.remove(s);

        }
        //输出什么?
        System.out.println(list);

    }
}