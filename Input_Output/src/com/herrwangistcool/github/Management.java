package com.herrwangistcool.github;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Scanner;

public class Management {
    static String welcome="您已登录，欢迎使用教务管理使用";
    Score current_score=new Score();
    user current_user=new user();
    HashMap users=new HashMap();
    public void register(){
        user stu=new user();
        stu.user_create();
        stu.password_set();
        users.put(stu.user_name,stu.user_password);
    }
    public int login(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名: ");
        current_user.user_name=sc.next();
        if(users.containsKey(current_user.user_name)){
            System.out.println("请输入密码: ");
            current_user.user_password=sc.next();
            if(users.get(current_user.user_name).equals(current_user.user_password)){
                System.out.println(welcome);
                return 1;
            }else {
                System.out.println("密码错误！");
                return 0;
            }
        }else {
            System.out.println("没有该用户！");
            return 0;
        }
    }
    public static void main(String[] args){
        Management x=new Management();
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("请选择功能:\n");
            System.out.print("1.注册用户\t"); System.out.println("2.用户登录\n");
            System.out.print("3.成绩录入\t"); System.out.println("4.成绩查询\n");
            System.out.print("5.打印成绩单\t");System.out.println("0.退出系统\t");
            int select=sc.nextInt();
            switch (select){
                case 0:
                    System.out.println("感谢使用，系统正在退出！");
                    System.exit(1);
                    break;
                case 1:
                    x.register();
                    break;
                case 2:
                    x.login();
                    break;
                case 3:
                    x.current_score.Input();
                    break;
                case 4:
                    x.current_score.search();
                    break;
                case 5:
                    x.current_score.show_Scores();
                default:break;
            }
        }
    }
}
