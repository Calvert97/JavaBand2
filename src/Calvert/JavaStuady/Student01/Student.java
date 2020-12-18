package Calvert.JavaStuady.Student01;

// 学生类
public class Student {

    //成员变量
    private String name;
    private int age;


    public void setName(String n){
            name = n;
        }


    // 提供get、set方法
    public void setAge(int a){
        //age = a;
        if (a < 0 || a >120){
            System.out.println("您给的年龄有误！");
        }else{
            age = a;
        }
    }


    //成员方法
    public void study(){
        System.out.println("好好学习");
    }
    //成员方法
    public void doHomework(){
        System.out.println("天天向上");
    }
    public void show(){
        System.out.println(name + "," + age);
    }

}
