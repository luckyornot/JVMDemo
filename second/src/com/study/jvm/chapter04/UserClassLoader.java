package com.study.jvm.chapter04;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 自定义类的加载器
 */
public class UserClassLoader extends ClassLoader {
    private String rootDir;

    public UserClassLoader(String rootDir) {
        this.rootDir = rootDir;
    }

    /**
     * 编写findClass方法的逻辑
     */
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        // 获取类的class文件字节数组
        byte[] classData = getClassData(name);
        if (classData == null) {
            throw new ClassNotFoundException();
        } else {
            //直接生成class对象
            return defineClass(name, classData, 0, classData.length);
        }
    }

    /**
     * 编写获取class文件并转换为字节码流的逻辑 * @param className * @return
     */
    private byte[] getClassData(String className) {
        // 读取类文件的字节
        String path = classNameToPath(className);
        try {
            InputStream ins = new FileInputStream(path);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = 0;
            // 读取类文件的字节码
            while ((len = ins.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            return baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 类文件的完全路径
     */
    private String classNameToPath(String className) {
        return rootDir + "\\" + className.replace('.', '\\') + ".class";
    }

    public static void main(String[] args) {

        // 在当前类的目录先生成User.class文件
        String rootDir = "E:\\softwareData\\idea\\FengZi001\\JVMDemo\\second\\src\\";

        try {
            // 创建自定义的类的加载器1
            UserClassLoader loader1 = new UserClassLoader(rootDir);
            Class clazz1 = loader1.findClass("com.study.jvm.chapter04.User");

            // 创建自定义的类的加载器2
            UserClassLoader loader2 = new UserClassLoader(rootDir);
            Class clazz2 = loader2.findClass("com.study.jvm.chapter04.User");

            System.out.println(clazz1 == clazz2); // clazz1与clazz2对应了不同的类模板结构。false
            System.out.println(clazz1.getClassLoader()); // com.study.jvm.chapter04.UserClassLoader@2503dbd3
            System.out.println(clazz2.getClassLoader()); // com.study.jvm.chapter04.UserClassLoader@7ea987ac

            // ######################
            Class clazz3 = ClassLoader.getSystemClassLoader().loadClass("com.study.jvm.chapter04.User");
            System.out.println(clazz3.getClassLoader()); // sun.misc.Launcher$AppClassLoader@18b4aac2

            System.out.println(clazz1.getClassLoader().getParent()); // sun.misc.Launcher$AppClassLoader@18b4aac2

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
