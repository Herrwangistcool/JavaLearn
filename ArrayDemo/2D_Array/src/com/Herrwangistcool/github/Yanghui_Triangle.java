package com.Herrwangistcool.github;

public class Yanghui_Triangle {
    public static void main(String[] args){
        //定义二维数组
        int[][] arr = new int[7][];

        //二维数组中的每一行分配空间
        for(int i=0; i<arr.length; i++){
            arr[i] = new int[i+1];
        }

        //将每一行的首尾赋值为1
        for(int i=0; i<arr.length; i++){
            arr[i][0] = 1;
            arr[i][i] = 1;
        }

        //填充中间的数字
        for(int i=2; i<arr.length; i++){
            //外层循环控制
            for(int j=1; j<i; j++){
                //内层循环控制
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }

        //打印最终结果
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
