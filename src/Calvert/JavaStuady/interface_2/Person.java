package Calvert.JavaStuady.interface_2;

public class Person implements Flyable,Fireable{

    String name;
    int age;

    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println(name+"吃东西。。。");
    }
    public void sleep(){
        System.out.println(name+"在睡觉。。。");
    }

    @Override
    public void fly() {
        System.out.println(name+"起飞了。。。");
    }

    @Override
    public void fire() {
        System.out.println(name+"还可以喷火。。。");
    }
}
