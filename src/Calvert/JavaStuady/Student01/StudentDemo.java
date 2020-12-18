package Calvert.JavaStuady.Student01;

import Calvert.JavaStuady.Student01.Student;

import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //创建对象
        Student s = new Student();

        //使用对象
        //System.out.println(s.name + "," + s.age);




        System.out.print("请输入学生的姓名：");
        String name = sc.next();
        s.setName(name);

        System.out.print("请输入学生的年龄：");
        int age = sc.nextInt();
        //s.setAge(50);
        s.setAge(age);

        s.show();

        s.study();
        s.doHomework();
    }

}
