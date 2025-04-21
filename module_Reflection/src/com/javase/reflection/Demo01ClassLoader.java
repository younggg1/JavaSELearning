package com.javase.reflection;

public class Demo01ClassLoader {
    public static void main(String[] args) {
        app();
        //ext();
        //boot();
    }

    /**
     * 负责加载核心类
     * rt.jar包中的类
     *
     * BootStrapClassLoader是C语言编写,我们获取不到
     */
    private static void boot() {
        ClassLoader classLoader = String.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);
    }


    /**
     * 负责加载扩展类
     */
    /*private static void ext() {
        ClassLoader classLoader = DNSNameService.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);
    }*/

    /**
     * 负责加载自定义类以及第三方jar中的类
     */
    private static void app() {
        ClassLoader classLoader = Demo01ClassLoader.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);

  /*      ClassLoader classLoader1 = FileUtils.class.getClassLoader();
        System.out.println("classLoader1 = " + classLoader1);
*/
   /*     ClassLoader parent = classLoader1.getParent();
        System.out.println("parent = " + parent);
*/
        //ClassLoader parent1 = parent.getParent();
        //System.out.println("parent1 = " + parent1);
    }
}

