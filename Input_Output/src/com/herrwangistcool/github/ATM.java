package com.herrwangistcool.github;

import java.util.Objects;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args){
        int myMoney=10000;
        int cash=0;
        int count=5;    //密码输入次数
        String pwd="123456";
        Scanner input=new Scanner(System.in);

        if(ATM.get_pwd(pwd)){
            System.out.println("欢迎使用建设银行ATM");
            myMoney=ATM.get_cash(myMoney);
        }
        System.out.println("系统退出");
    }

    public static int get_cash(int myMoney){
        int cash;
        int state;
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("请输入取款金额");
            cash=input.nextInt();
            if(myMoney>cash){
                myMoney-=cash;
            }else{
                System.out.println("余额不足");
            }
            System.out.println("当前余额: "+myMoney+"，继续取款请按1，退出取款请按2");
            state=input.nextInt();
            if(state==1){
                continue;
            }else if(state==2){
                System.out.println("退出取款");
                break;
            }else{
                System.out.println("非法输入");
                break;
            }
        }while (myMoney>0);
        return myMoney;
    }

    private static boolean get_pwd(String pwd){
        Scanner input=new Scanner(System.in);
        String cur_pwd;
        int count=5;
        do{
            System.out.println("请输入密码");
            cur_pwd=input.nextLine();
            if(cur_pwd.equals(pwd)){
                System.out.println("密码正确");
                return true;
            }else {
                count -= 1;
                System.out.println("密码错误");
            }
        }while (count>0);
        return false;
    }
}
