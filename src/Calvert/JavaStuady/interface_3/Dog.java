package Calvert.JavaStuady.interface_3;

public class Dog extends Animal implements Runnable,Swimable{
    public void shout(){
        System.out.println("汪汪汪~");
    }

    @Override
    public void run() {
        System.out.println("狗狗游泳，，，");
    }

    @Override
    public void swim() {
        System.out.println("狗狗跑步，，，");
    }
}
