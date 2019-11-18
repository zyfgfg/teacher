package cn;

import banyuan.com.Person;

public interface UpdateData {

    //现在  对一个数据进行更新操作
    /**
     * 1.由自己去写接口 最终的实现也由自己把控
     * 2.由你的项目负责人去写一个统一的接口  你们到时候哦直接去调用就行
     */
    void   add(Person person);

    void   del(int  personIdCard);



}
