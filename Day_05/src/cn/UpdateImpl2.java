package cn;

import banyuan.com.Person;

public class UpdateImpl2  implements  UpdateData {
    @Override
    public void add(Person person) {
        System.out.println("这是程序员1写的增加...");
    }

    @Override
    public void del(int personIdCard) {
        System.out.println("这是程序员1写的删除...");
    }
}
