package com.herrwangistcool.github;

import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class stuCard {
    public String name;
    String stu_ID;
    String bank_card_id;
    private String password;
    Date registerDate;
    float balance=0;
    boolean is_valid=false;
    public stuCard(){}
    public stuCard(String stu_name){this.name=stu_name;}
    public void init(){
        System.out.println("请输入注册信息：\n");
        Scanner input=new Scanner(System.in);
        System.out.println("1.姓名：");
        this.name=input.nextLine();
        System.out.println("2.绑定的银行卡号：");
        this.bank_card_id=input.nextLine();
        System.out.println("3.学生卡号：");
        this.stu_ID=input.nextLine();
        password_set();
        this.registerDate=new Date();
        is_valid=true;
    }
    private void password_set() {
        String verify_password;
        Scanner input;
        do {
            System.out.println("输入您的密码，至少含有一个字母和数字：");
            input = new Scanner(System.in);
            verify_password = input.nextLine();
        } while (!password_verify(verify_password));
        System.out.println("重新输入您的密码以验证");
        if (Objects.equals(input.nextLine(), verify_password)) {
            this.password = verify_password;
        } else {
            this.password_set();
        }
    }
    private boolean password_verify(String verify_password){
        int char_count=0;
        int num_count=0;
        if(verify_password.length()>255){
            System.out.println("你的密码太长了");
            return false;
        }else if(verify_password.length()<4){
            System.out.println("你的密码太短了");
            return  false;
        }
        for (int i=0; i<verify_password.length(); i++){
            if(Character.isDigit(verify_password.charAt(i))) num_count += 1;
            else if(Character.isLetter(verify_password.charAt(i))) char_count += 1;
            if(char_count>0 && num_count>0) return true;
        }
        if(char_count==0)   System.out.println("密码缺少字母");
        if (num_count==0)   System.out.println("密码缺少数字");
        return false;
    }
    public float re_charge(){
        float charged_money;
        Scanner input=new Scanner(System.in);
        if(is_valid){
            System.out.println("请输入充值金额：");
            if(input.hasNextFloat()){
                charged_money=input.nextFloat();
                this.balance+=charged_money;
                return charged_money;
            }
        }
        return 0;
    }
    public void showInfo(){
        System.out.println(this.name);
        System.out.println(this.bank_card_id);
        System.out.println(this.balance);
        System.out.println(this.registerDate.toString());
    }
    public static void main(String[] args){
        stuCard Tom=new stuCard();
        Tom.init();
        Tom.re_charge();
        Tom.showInfo();
    }
}
