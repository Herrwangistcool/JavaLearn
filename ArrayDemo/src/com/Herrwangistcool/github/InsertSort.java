package com.Herrwangistcool.github;

public class InsertSort {
    public static void main(String[] args){
        //插入排序
        int[] arr = {1,2,6,3,0,4,7,9,12,8};
        //遍历每一个数字
        for(int i=0; i<arr.length; i++){
            //每个数字都要执行一遍插入比较过程
            for(int k=i; k>=0; k--){
                //如果前一个数字存在，并且小于前一个数字
                if(k-1>=0 && arr[k]<arr[k-1]){
                    //交换数字
                    int tmp = arr[k];
                    arr[k] = arr[k-1];
                    arr[k-1] = tmp;
                }else {
                    //否则终止插入比较过程
                    break;
                }
            }
        }
        //打印最终数组的内容
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
