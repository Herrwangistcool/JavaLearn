package com.herrwangistcool.github;

import java.util.Objects;
import java.util.Scanner;

public class user {
    String user_name;
    protected String user_password;
    public user(){}
    public user(String user_name){
        this.user_name=user_name;
    }
    public void user_create(){
        Scanner Input=new Scanner(System.in);
        if(this.user_name==null){
            System.out.println("Enter your user name.");
            this.user_name=Input.nextLine();
        }
    }
    void password_set() {
        String verify_password;
        Scanner Input;
        do {
            System.out.println("Enter your password, which must include at least one number and one letter.");
            Input = new Scanner(System.in);
            verify_password = Input.nextLine();
        } while (!password_verify(verify_password));
        System.out.println("Enter your password again for verifying");
        if (Objects.equals(Input.nextLine(), verify_password)) {
            this.user_password = verify_password;
        } else {
            this.password_set();
        }
    }
    private boolean password_verify(String verify_password){
        int char_count=0;
        int num_count=0;
        if(verify_password.length()>255){
            System.out.println("Your password is too long.");
            return false;
        }else if(verify_password.length()<4){
            System.out.println("Your password is too short.");
            return  false;
        }
        for (int i=0; i<verify_password.length(); i++){
            if(Character.isDigit(verify_password.charAt(i))) num_count += 1;
            else if(Character.isLetter(verify_password.charAt(i))) char_count += 1;
            if(char_count>0 && num_count>0) return true;
        }
        if(char_count==0)   System.out.println("The password missing a letter");
        if (num_count==0)   System.out.println("The password missing a number");
        return false;
    }

    public static void main(String args[]){
        user Tom=new user("Tom·Land");
        Tom.password_set();
    }
}
