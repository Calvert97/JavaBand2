package Calvert.JavaStuady.final_1;

// final修饰类 不能被继承
public class Car {

    // 实例常量，不再提供默认值，必须赋值，并且只能赋值一次
    //static String ADDRESS = "德国";
    static String ADDRESS;
    static {
        ADDRESS = "德国";
    }

    //final String brand = "宝马";
    final String brand;
    public Car(){
        this.brand = "宝马";
    }

    String color;

    // final修饰方法 不能被重写，但是可以被继承
    public final void run(){
        System.out.println("汽车正在前进");

        // final修饰变量 不能被再次赋值，即为常量
        final int num = 100;

    }
}
