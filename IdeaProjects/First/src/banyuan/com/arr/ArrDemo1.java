package banyuan.com.arr;

public class ArrDemo1 {

    public static void main(String[] args) {
        /*  静态数组 数据类型  [] 数组名={};
            动态数组 数据类型 [] 数组名=new 数据类型[长度]
            注意:长度一旦固定 就不能变

         */
        int [] arr=new int[5];
       // arr[0]=1;
        //System.out.println(arr[0]); //1
        //arr=new int[6];

        arr[0]=3;
        int  [] arr3=null; //没有任何指向
        arr3=arr;

        arr3[0]=98;

        System.out.println(arr3[0]+"---"+arr[0]);

        //System.out.println(arr[0]);//3

        String [] str=new String[4];
        str[0]="一个能打的都没有";
      //  int [] arr4=new int[]{}; 简化之后
        //    int [] arr5={};
          char [] ch={'r','w','t','y',97};
          int [] x={12,3,'a'};
          float [] f={12.5f,5,56};
        System.out.println(ch[4]);
        System.out.println(f[1]);

        int  [] array=new int[2];
        System.out.println("我是动态数组创建的:"+array[0]);

        int  [] rt={12};
        System.out.println(rt[0]);




    }

}
