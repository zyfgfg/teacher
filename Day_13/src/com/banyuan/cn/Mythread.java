package com.banyuan.cn;

public class Mythread {

    /**
     *  一个账户 1000块钱 :两个人 A B  分别在柜台和ATM机 取钱
     *  A每次取钱100  B每次取200   最终在控制台输出每个人取钱数
     */
     static  int   money=1000;


     public  synchronized     void  getMoneyA(int  money) {

             Mythread.money -= 100;
             System.out.println(Thread.currentThread().getName() + "----A取了100");
         try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }

     }


    public   synchronized  void  getMoneyB(int  money) {

        if(Mythread.money<200) {
            Mythread.money -= 200;
            System.out.println(Thread.currentThread().getName() + "----B取了200");
        }

        try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }

    }



    }
