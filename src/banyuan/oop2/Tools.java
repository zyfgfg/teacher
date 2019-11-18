package banyuan.oop2;

public class Tools {

    //求和
    public int  sum(int  x,int y){ //x  y形式参数
        return   x+y;
    }
    //引用类型
    public  String  getStr(String  name){

        return  name+"handsome";

    }

    //
    public  Student     showInfo(Student  stu,String  job){

        stu.setName("哪吒");

        return   stu;

    }


    public   int [] getArr(int [] arr){ //arr 接收的是数组的地址

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                arr[i]=arr[i]+2;
            }
        }

        return    arr;

    }











}
