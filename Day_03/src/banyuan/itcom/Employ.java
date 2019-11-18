package banyuan.itcom;

public class Employ {
    private  int  empno;
    private  String  ename;
    private  String  address;
    private  String  phone;
    private  String   job;

    private  Dept dept; //

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }



    public Employ() {
    }

    public Employ(int empno, String ename, String address, String phone, String job) {
        this.empno = empno;
        this.ename = ename;
        this.address = address;
        this.phone = phone;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", job='" + job + '\'' +
                ", dept=" + dept +
                '}';
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
