package com.study.jvm;

/**
 * @author wang
 * @create 2020-11-25-18:50
 *
 * 反编译字节码文件
 */
public class StackStruTest {

    static class Father{
        public static int A = 1;
        static{
            A = 2;
        }
    }

    static class Son extends Father{
        public static int B = A;
    }

    public static void main(String[] args) {
        //加载Father类，其次加载Son类。
        System.out.println(Son.B);//2
    }
}
