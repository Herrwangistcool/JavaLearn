package com.herrwangistcool.github;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

import static java.util.Arrays.binarySearch;

public class Score {
    BigDecimal Average;
    String val_1, val_2;
    String[] Courses=new String[10];
    String[] Scores=new String[10];
    int n=0;
    public boolean search(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入需要查询的成绩:");
        String item=sc.next();
        for(int i=0; i<n; i++){
            if(Courses[i].equals(item)){
                System.out.println("您的"+item+"成绩为: "+Scores[i]);
                return true;
            }
        }
        return false;
    }
    public void Input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入课程数量, 不超过10: ");
        n=sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("请输入课程名: ");
            Courses[i]=sc.next();
            System.out.println("请输入该课程成绩");
            Scores[i]=sc.next();
        }
    }
    public void show_Scores(){
        for(int i=0; i<n; i++){
            System.out.println("科目："+Courses[i]+"   成绩："+Scores[i]+"\n");
        }
    }
    public BigDecimal get_average(String[] Scores){
        BigDecimal sum=new BigDecimal('0');
        for(int i=0; i<Scores.length-1; i++){
            BigDecimal v1=new BigDecimal(Scores[i]);
            sum.add(v1);
        }
        return sum.divide(BigDecimal.valueOf(Scores.length));
    }

    public static void main(String args[]){
        Score test=new Score();
        test.Input();
        test.show_Scores();
        test.search();
    }
}
