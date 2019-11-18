package com.banyuan.cn;

public class PersonB  extends  Thread{

    Mythread  mt;
    public   PersonB(Mythread  mt){
        this.mt=mt;
    }

    @Override
    public void run() {


            while (Mythread.money >= 200) {

               synchronized (mt){
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
//

            }
        }


}
