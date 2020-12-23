package Calvert.JavaStuady.interface_3;

public class TestDog {
    public static void main(String[] args) {
        Dog wangcai = new Dog();
        Animal a = wangcai;
        Runnable runnable = wangcai;
        Swimable swimable = wangcai;

        wangcai.eat();
        a.sleep();
        runnable.run();
        swimable.swim();
    }
}
