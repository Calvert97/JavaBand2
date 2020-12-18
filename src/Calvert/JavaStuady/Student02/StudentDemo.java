package Calvert.JavaStuady.Student02;

// 学生测试类
public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s1 = new Student();

        //使用set方法给成员变量赋值
        s1.setName("Mixin");
        s1.setAge(19);

        s1.show();


        Student s2 = new Student("Calvert",20);
        s2.show();
    }


}
