package com.banyuan.jdbc01.pojo;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 */
class Point {
    public static void main(String[] args) throws JAXBException, SAXException {

            Thread t1 = new MyThread();
            Thread t2 = new MyThread();
            t1.setName("第一个线程！");
            t2.setName("第二个线程！");
            t1.start();
            t2.start();
        }

    }
    class MyThread extends Thread{
        private static int arr[] = new int[6];
        private static int j = 0;
        @Override
        public void run(){
            for(int i = 0;i < 3; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
                addArray();
            }
        }
        public  void addArray() {
            synchronized (MyThread.class) {
                Random r = new Random();
                int num = r.nextInt(100)+1;
                arr[j] = num;
                System.out.println(Thread.currentThread().getName()+"arr["+j+"]="+num);
                j++;
            }


        }
    }


