package com.jy;

public class Employee {
    //员工编号
    private  String empNo;
    //员工姓名
    private  String empName;
    //部门信息
    private  Dept dept;

    public  Employee(String empNo, String empName, Dept dept) {
        this .empNo = empNo;
        this .empName = empName;
        this .dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo='" + empNo + '\'' +
                ", empName='" + empName + '\'' +
                ", dept=" + dept +
                '}';
    }
}
