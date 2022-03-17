package com.Herrwangistcool.github;

public class multiplicationTable {
    public static void main(String[] args){
        for(int i=1; i<=9; i++){
            for(int k=1; k<=i; k++){
                System.out.print(k+"*"+i+"="+k*i+" ");
            }
            System.out.println();
        }
    }
}
