package com.herrwangistcool.github;

public class InnerClass {
    private String name="就爱上java课";
    public void show(){
        class MInner{
            int score=83;
            public int getScore(){
                return score+10;
            }
        }
        MInner mi=new MInner();
        mi.getScore();
        System.out.println(name+"\n这样的同学必须加分:"+mi.getScore());
    }
    public static void main(String[] args){
        InnerClass mo=new InnerClass();
        System.out.println(mo.name);
        mo.show();
    }
}
