package mapDemo1;

import java.util.Objects;

public class Student implements Comparable<Student>{

    private   String  name;
    private  int     age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public int compareTo(Student o) {
        int  result=this.getName().length()-o.getName().length(); //
        int  num= result==0 ? this.getName().compareTo(o.getName()):result; //
        int    number= num== 0 ? this.getAge()-o.getAge():num;
        return number;
    }
}
