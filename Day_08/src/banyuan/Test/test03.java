package banyuan.Test;

import java.lang.reflect.Array;

/**.假设有一个长度为5的数组，如下所示。
 * Int[] array = new int [] {1、3、-1、5、-2}；
 * 现创建一个新数组newArray【】，
 * 要求新数组中的元素的存放顺序与原数组中的元素逆序，
 * 并且如果原数组中的原数值小于0，在新数组中按0存储（10分）*/
public class test03 {
    public static void main(String[] args) {
          int[] array = new int [] {1,3,-1,5,-2};
          int []newArray=new int[5];
        for (int i = 0; i < array.length/2; i++) {
            int x=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=x;

        }
        for (int i = 0; i <5 ; i++) {
            if(array[i]<0){
                array[i]=0;
            }
        }
        for (int i = 0; i <5 ; i++) {
            newArray[i]=array[i];
            System.out.println(newArray[i]);
        }
    }
}
