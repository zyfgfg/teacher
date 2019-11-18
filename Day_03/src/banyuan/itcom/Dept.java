package banyuan.itcom;

import java.util.Arrays;

public class Dept {
    private  int deptno;//部门名称
    private String  dname;//部门名称
    private String  dLocal;//部门地址

    private  Employ[] emp;

    public Employ[] getEmp() {
        return emp;
    }

    public void setEmp(Employ[] emp) {
        this.emp = emp;
    }

    public Dept() {
    }

    public Dept(int deptno, String dname, String dLocal) {
        this.deptno = deptno;
        this.dname = dname;
        this.dLocal = dLocal;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", dLocal='" + dLocal + '\'' +
                ", emp=" + Arrays.toString(emp) +
                '}';
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getdLocal() {
        return dLocal;
    }

    public void setdLocal(String dLocal) {
        this.dLocal = dLocal;
    }
}
