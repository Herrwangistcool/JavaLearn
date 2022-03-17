package com.Herrwangistcool.github;

public class BubbleSort {
    //冒泡排序
    public static void main(String[] args){
        int[] arr = {17,6,12,30,9,4,11};
        for(int i=1; i<arr.length; i++){
            //循环轮数
            for(int j=0; j<arr.length-i; j++){
                //内层循环次数为数组长度-已循环轮数
                if(arr[j]>arr[j+1]){
                    //如果前一个数大于后一个数，交换两个数位置
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        //打印数组
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
