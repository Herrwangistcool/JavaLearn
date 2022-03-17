package com.Herrwangistcool.github;

public class ArrayInsert {
    public static void main(String[] args){
        /*
            现有长度为6的数组，将一个新的数字插入到数组中
            插入后的数字排在第3位，数组长度为7
        */
        /*
            java中数组长度是不变的
            需要新建一个数组，先把原有内容复制进去，再插入
         */
        int[] list = {99,85,82,63,60,19};

        //要插入的新数字
        int num = 8;

        //创建新数组
        int[] arr = new int[7];

        //遍历旧数组
        for(int i=0; i<list.length; i++){
            arr[i] = list[i];   //复制每一位
        }

        //遍历数组，元素向后移动
        for(int i=arr.length-1; i>=3; i--){
            arr[i] = arr[i-1];  //前一位赋值给后一位
        }

        //新元素插入第3位
        arr[2] = num;

        //重新打印数组arr
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+",");
        }
    }
}
