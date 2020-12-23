package Calvert.JavaStuady.static_1;

public class Person {
    String name;

    // 静态成员的最大数量
    static int max = 0;

    // 静态代码块 类加载的时候 执行 且只执行一次
    static {
        max = 1000;
        System.out.println("人的最大数量："+max);

        // 静态方法

    }
}
