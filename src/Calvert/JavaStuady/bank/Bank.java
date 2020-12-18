package Calvert.JavaStuady.bank;

import java.util.Random;
import java.util.Scanner;

public class Bank {
    // 保存用户的数组
    private User[] users = new User[5];

    // 保存个数；
    private int size;
    // 初始化方法
    public void initial(){
    // 创建用户1
        User user1 = new User();
        user1.setCardNo("6222888888888888");
        user1.setIdentity("15147712614");
        user1.setUsername("Mixin");
        user1.setPassword("123456");
        user1.setPhone("15147712614");
        user1.setBalance(1000000000);

        // 创建用户2
        User user2 = new User("629999999999","18447052123","calvert","123456","18446052123",1100000);

        //放入数组
        users[0]=user1;
        users[1]=user2;
        size = 2;

        // System.out.println("用户初始化完成");
    }

    public Bank(){
        initial();
    }

    // 功能2
    public void login(){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入卡号：");
        String cardNo = input.next();
        System.out.println("请输入密码：");
        String password = input.next();

        // 遍历数组
        User u = null;//u保存找到用户
        for (int i = 0; i<size;i++){
            if (users[i].getCardNo().equals(cardNo)&&users[i].getPassword().equals(password)){
                u = users[i];
                break;
            }
        }
        if (u != null){
            //成功 显示菜单
            System.out.println("登录成功");
            showMenu(u);
        }else {
            System.out.println("卡号或密码错误！");
        }
    }

    // 功能3 显示菜单
    public void showMenu(User u){
        Scanner input = new Scanner(System.in);
        System.out.println("===========欢迎进入银行系统===当前用户："+u.getCardNo() + "=========");
        do {
        System.out.println("===1.存款 2.取款 3.转账 4.查询余额 5.修改密码 0.退出===");
        int choice = input.nextInt();

            switch (choice){
                case 1:
                    this.save(u);
                    break;
                case 2:
                    this.withDraw(u);
                    break;
                case 3:
                    this.trans(u);
                    break;
                case 4:
                    query(u);
                    break;
                case 5:
                    modifyPassword(u);
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }while (true);
    }

    // 功能4 存钱
    public void save(User u){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入存款金额");
        double m = input.nextDouble();
        if (m > 0){
            u.setBalance(u.getBalance()+m);
            System.out.println("存钱成功！金额："+u.getBalance());
        }else {
            System.out.println("存钱失败，请重新输入。。。");
        }
    }

    // 功能5 取钱
    public void withDraw(User u){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入取款金额");
        double m = input.nextDouble();
        if (m > 0){
            if (u.getBalance() >= m){
            u.setBalance(u.getBalance()-m);
            System.out.println("取钱成功！金额："+u.getBalance());
            }else {
                System.out.println();
            }
        }else {
            System.out.println("取钱失败，请重新输入。。。");
        }
    }

    // 转账功能
    public void trans(User u){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入对方的银行卡号：");
        String cardNo = input.next();
        System.out.println("请输入转账金额：");
        double m = input.nextDouble();

        // 判断对方卡号是否存在
        User toUser = null;
        for (int i = 0; i<size;i++){
            if (users[i].getCardNo().equals(cardNo)){
                toUser = users[i];
                break;
            }
        }
        // 判断
        if (toUser != null){
            // 存在对方卡号
            if (u.getBalance()>=m){
                //转账
                //扣钱
                u.setBalance(u.getBalance()-m);
                //加钱
                toUser.setBalance(toUser.getBalance()+m);
                System.out.println("转账成功");


            }else {
                System.out.println("转帐失败，余额不足");
            }
        }else{
            System.out.println("对方卡号不存在，请重新输入！");
        }
    }

    // 查询余额
    public void query(User u){
        System.out.println("卡号："+u.getCardNo()+"用户名："+u.getUsername()+"余额"+u.getBalance());
    }

     // 修改密码
    public void modifyPassword(User u){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入新的密码：");
        String newpassword = input.next();
        if (newpassword.length() == 6){
            u.setPassword(newpassword);
        }else{
            System.out.println("您输入的密码不符合要求！");
        }
    }

}
