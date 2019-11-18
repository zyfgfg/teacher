package com.banyuan.cn;

public class PersonA  extends Thread {

    Mythread  mt;
    public   PersonA(Mythread  mt){
        this.mt=mt;
    }


    @Override
    public void run() {

            while (Mythread.money >=100) {

                synchronized (mt){

                    Mythread.money -= 100;
                    System.out.println(Thread.currentThread().getName() + "----A取了100");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }
                }




            }
        }


}
