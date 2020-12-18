package Calvert.JavaStuady;

import java.util.Random;
import java.util.Scanner;

public class JavaDemo {
    public static void main(String[] args){
         Random r = new Random();
         int number = r.nextInt(100) + 1;
         Scanner sc = new Scanner(System.in);
         
         System.out.println("请输入你的数字：");
         int GusNumber = sc.nextInt();

         if (number == GusNumber) {
             System.out.println("您的输入正确！");
            }
        else if (number < GusNumber){
            System.out.println("您的输入太大了！");
             }
        else {
            System.out.println("您的输入太小了！");
             }
        sc.close(); 
    }
}