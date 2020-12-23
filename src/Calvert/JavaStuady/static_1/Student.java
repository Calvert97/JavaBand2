package Calvert.JavaStuady.static_1;

public class Student {
    String name;
    int age;

    // 静态属性 属于整个类
    static int count;

    public void show(){
        System.out.println(name+"的年龄为"+age);
    }

    public static void method1(){
        System.out.println("第一个静态方法");
        method2();
    }
    public static void method2(){
        System.out.println("第二个静态方法");
    }

}
