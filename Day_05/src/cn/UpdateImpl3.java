package cn;

import banyuan.com.Person;

public class UpdateImpl3 implements  UpdateData {
    @Override
    public void add(Person person) {
        System.out.println("这是程序员2写的增加...");
    }

    @Override
    public void del(int personIdCard) {
        System.out.println("这是程序员2写的删除...");
    }
}
