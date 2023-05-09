package com.jy;

public class Dept {

    //部门编号
    private  String deptNo;
    //部门名称
    private  String deptName;

    public  Dept(String deptNo, String deptName) {
        this .deptNo = deptNo;
        this .deptName = deptName;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptNo='" + deptNo + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
