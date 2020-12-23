package Calvert.JavaStuady.static_1;

public class Teacher {
    String name;
    int age;
    double salary;

    //保存对象的创建次数
    static int count = 0;
    public Teacher(){
        Teacher.count++;
        count++;
    }

    public void show(){
        System.out.println(name+"---"+age+"---"+salary);
    }
}
