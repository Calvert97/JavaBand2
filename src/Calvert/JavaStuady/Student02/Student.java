package Calvert.JavaStuady.Student02;

// 学生类
public class Student {
        //成员变量
        private String name;
        private int age;

        // 构造方法1-无参构造方法
        public Student(){ }
        // 构造方法2-多个参数构造方法
        public Student(String name,int age){
            this.name = name;
            this.age = age;
        }


        // 成员方法 提供get、set方法
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }


        public void setAge(int age){
            this.age = age;
        }
        public int getAge(){
            return age;
        }


        public void show(){
            System.out.println(name + "," + age);
        }

}
