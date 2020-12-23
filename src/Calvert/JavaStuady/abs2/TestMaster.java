package Calvert.JavaStuady.abs2;

import java.util.Map;

public class TestMaster {
    public static void main(String[] args) {
        Master xiaoming = new Master("小明");
        Vehicle car = new Car("宝马");
        Vehicle bike = new Bike("永久");
        xiaoming.goHome(bike);
    }
}
