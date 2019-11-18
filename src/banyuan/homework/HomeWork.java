package banyuan.homework;

public class HomeWork {

    public static void main(String[] args) {

        show(8);


    }

    /**
     *
     * @param size 表示菱形的行数
     */
    public  static  void   show(int size){
        if(size % 2==0){ //做个奇数和偶数判断
            size++;
        }
        for(int  i=0;i<size/2+1;i++){//循环的次数  菱形的上半部分
            for (int j = size/2+1; j>i+1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = size/2+1; i < size; i++) {  //i =5  表示第六行
            for (int j = 0; j < i- size/2; j++) {
                System.out.print(" ");
            }

            for (int k =0;k< 2*size-1-2*i; k++) { // 随着i的增加 星星数在减少
                System.out.print("*");
            }

            System.out.println();
        }





    }


}
