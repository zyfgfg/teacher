package banyuan.Test;



import java.util.Arrays;

public class sort  {
        public int[] array;
        public sort(int[] array){
            this.array=array;
        }
        //冒泡排序
        public void test1() {
            for(int i=1;i<array.length;i++) {
                for(int j=0;j<array.length-i;j++) {
                    if(array[j]>array[j+1]) {
                        int temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
        }
        //选择排序
        public void test2() {
            int i,j,index;
            for(i=0;i<array.length;i++) {
                index=i;
                for(j=i+1;j<array.length;j++) {
                    if(array[j]<array[index]) {
                        index=j;
                    }
                }
                int temp=array[i];
                array[i]=array[index];
                array[index]=temp;
            }
            System.out.println(Arrays.toString(array));
        }
        //插入排序
        public void test3() {
            int i,j,temp;
            for(i=1;i<array.length;i++) {
                temp=array[i];
                for(j=i-1;j>=0;j--) {
                    if(temp>array[j]) {
                        break;
                    }else {
                        array[j+1]=array[j];
                    }
                }
                array[j+1]=temp;
            }
            System.out.println(Arrays.toString(array));
        }
        public static void main(String[] args) {
            int[] array={23,34,25,66,21};
            sort a=new sort(array);
            a.test3();
        }
    }


