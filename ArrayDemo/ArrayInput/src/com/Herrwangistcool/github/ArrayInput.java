package com.Herrwangistcool.github;

import java.util.Scanner;

public class ArrayInput {
    /*在控制台输入5位学员的成绩，计算并打印学员的平均成绩*/
    public static void main(String[] args){
        float[] scores = new float[5];  //成绩数组
        float sum = 0;  //成绩总和
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入5位学员的成绩: ");
        for(int i=0; i<scores.length; i++){
            scores[i] = sc.nextInt();
            sum += scores[i];
        }
        //计算并输出平均分
        System.out.println("学员的平均分是："+sum/scores.length);
    }
}
