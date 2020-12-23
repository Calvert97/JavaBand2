package Calvert.JavaStuady.abs;

abstract class Animal {
    String breed;
    int age;
    String sex;

    // 抽象方法
    public abstract void eat();
    public void sleep(){
        System.out.println("动物睡。。。");
    }

}
