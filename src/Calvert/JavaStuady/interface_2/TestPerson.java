package Calvert.JavaStuady.interface_2;

import java.time.Period;

public class TestPerson {
    public static void main(String[] args) {
    Person xiaoming = new Person("小明",20);
    xiaoming.fly();
    xiaoming.fire();
    System.out.println("==========多态=============");
    Flyable flyable = new Person("Calvert",22);
    flyable.fly();

    Fireable fireable = new Person("小张",22);
    fireable.fire();

    }
}
