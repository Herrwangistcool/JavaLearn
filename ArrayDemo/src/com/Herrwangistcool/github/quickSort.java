package com.Herrwangistcool.github;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args){
        int[] array = new int[]{-128,78,5,0,6,-123,6,54,2,3,6};
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array){
        subSort(array, 0, array.length-1);
    }

    public static void subSort(int[] array, int low, int high){
        //选第一个元素作为pivot
        //指针i，指针j从第二个元素除法使得：
        //指针i左边的都小于pivot，指针i，指针j中间的（包括i，j）都大于pivot
        //j指针比i跑得快，j到达最后一个
        if(low<high){
            int pivot = array[low];
            int i = low + 1;
            int j = low + 1;
            while (j<=high){
                //一开始i，j同步直到第一个比pivot大的数出现，i停下了
                if(array[j]<pivot){
                    swap(array, i, j);
                    i++;
                }
                j++;
            }
            //最后交换pivot和第i-1个
            swap(array, low, i-1);
            //递归调用左边右边
            subSort(array, low, i-1);
            subSort(array, i, high);
        }
    }

    public static void swap(int[] array, int low, int high){
        int tmp = array[low];
        array[low] = array[high];
        array[high] = tmp;
    }
}
