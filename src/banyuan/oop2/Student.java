package banyuan.oop2;

public class Student {

    private  String  name;
    private  int  age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //到此为止  一个标准的封装类 就如上

    public  void  duogongneng(){
        System.out.println(name+"可以 唱跳rap篮球");
    }

}
