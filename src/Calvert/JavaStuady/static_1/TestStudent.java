package Calvert.JavaStuady.static_1;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "aaa";
        s1.age = 20;
        Student s2 = new Student();
        s2.name = "bbb";
        s2.age = 18;

        s1.show();
        s2.show();

         // 调用静态属性---类名.静态属性名
        Student.count = 59;
        System.out.println("学生数量"+Student.count);

        System.out.println("=======================");

        // 调用静态属性---类名.方法名
        Student.method1();
        Student.method2();
    }
}
