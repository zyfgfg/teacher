package cn;


import banyuan.com.Person;

public class UpdataDataImpl implements UpdateData {

    //项目负责人写的统一规范

    @Override
    public void add(Person person) {
        System.out.println("一系列的增家用户操作");
    }

    @Override
    public void del(int personIdCard) {
        System.out.println("一系列的删除操作");
    }
}
