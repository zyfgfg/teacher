package banyuan.zhangyukaoshi;

public class Student {
    private int number;
    private String name;
    private int age;
    private int python;
    private int linux;

    public int getJava(int java) {
        return Java;
    }

    public void setJava(int java) {
        Java = java;
    }

    private int Java;

    private int sql;
    private int sum;
    private int avg;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPython() {
        return python;
    }

    public void setPython(int python) {
        this.python = python;
    }

    public int getLinux() {
        return this.linux;
    }

    public void setLinux(int linux) {
        this.linux = linux;
    }

    public int getSql() {
        return this.sql;
    }

    public void setSql(int sql) {
        this.sql = sql;
    }

    public int getSum() {
        return this.sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getAvg() {
        return this.avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", python=" + python +
                ", linux=" + linux +
                ", sql=" + sql +
                ", sum=" + sum +
                ", avg=" + avg +
                '}';
    }
}
